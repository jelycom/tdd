package cn.jely.cd.args;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArgsParser {
    Map<String, Arg> argMap = new HashMap<>();
    Map<String, Boolean> argNullSetting = new HashMap<>();
    private void init() {
        argMap.put("-l", new BooleanArg(Boolean.TRUE, false));
        argNullSetting.put("-l", false);
        argMap.put("-p", new PortArg());
        argNullSetting.put("-p", false);
        argMap.put("-d", new DirectoryArg());
        argNullSetting.put("-p", true);
    }
    public List<Arg> parse(String[] args) {
        if(argMap.isEmpty()) init();
        List<Arg> argBeans = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            if(!argMap.containsKey(arg)) throw new IllegalArgumentException("Unkown Option:" + arg);
            Arg argBean = argMap.get(arg);
            if (i+1<args.length&&!args[i + 1].startsWith("-")) {
                argBean.setValue(args[++i]);
            }
            argBeans.add(argBean);
        }
        return argBeans;
    }
}
