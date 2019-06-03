package cn.jely.cd.args;

public class PortArgSchema extends ArgSchema<PortArg> {
    @Override
    public PortArg parse(String s) {
        PortArg argParser = new PortArg();
        setParserProperty(s,argParser);
        return argParser;
    }

    @Override
    protected String parserKey() {
        return "Port";
    }
}
