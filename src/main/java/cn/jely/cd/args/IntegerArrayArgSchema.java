package cn.jely.cd.args;

public class IntegerArrayArgSchema extends ArgSchema<IntegerArrayArg>{
    @Override
    public IntegerArrayArg parse(String s) {
        IntegerArrayArg integerArrayArg = new IntegerArrayArg();
        setParserProperty(s, integerArrayArg);
        return integerArrayArg;
    }

    @Override
    protected String parserKey() {
        return "[Integer]";
    }
}
