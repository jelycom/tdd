package cn.jely.cd.args;

public class BooleanArgSchema extends ArgSchema<BooleanArg> {
    @Override
    public BooleanArg parse(String s) {
        BooleanArg booleanArgParser = new BooleanArg();
        setParserProperty(s,booleanArgParser);
        return booleanArgParser;
    }

    @Override
    protected String parserKey() {
        return "Boolean";
    }
}
