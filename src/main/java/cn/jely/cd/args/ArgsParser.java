package cn.jely.cd.args;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArgsParser{
    Map<String, Arg> argMap = new HashMap<>();
    private void init() {
        BooleanArg booleanArg = new BooleanArgSchema().parse("-l:Boolean:true");
        PortArg portArg = new PortArgSchema().parse("-p:Port:");
        DirectoryArg directoryArg = ((new DirectoryArgSchema())).parse("-d:Directory");
        StringArrayArg stringArrayArg = new StringArrayArgSchema().parse("-g:[String]:[]");
        IntegerArrayArg integerArrayArg = new IntegerArrayArgSchema().parse("-x:[Integer]");
        argMap.put(booleanArg.getKey(), booleanArg);
        argMap.put(portArg.getKey(), portArg);
        argMap.put(directoryArg.getKey(),directoryArg);
        argMap.put(stringArrayArg.getKey(), stringArrayArg);
        argMap.put(integerArrayArg.getKey(), integerArrayArg);
    }
    public List<Arg> parse(String[] args) {
        if(argMap.isEmpty()) init();
        List<Arg> argBeans = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            if(!argMap.containsKey(arg)) throw new IllegalArgumentException("Unknown Option:" + arg);
            Arg argBean = argMap.get(arg);
            if (i+1<args.length&&!args[i + 1].startsWith("-")) {
                argBean.setValue(args[++i]);
            }
            argBeans.add(argBean);
        }
        return argBeans;
    }
}
