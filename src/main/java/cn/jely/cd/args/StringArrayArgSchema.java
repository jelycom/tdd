package cn.jely.cd.args;

public class StringArrayArgSchema extends ArgSchema<StringArrayArg>{
    @Override
    public StringArrayArg parse(String s) {
        StringArrayArg arrayArg = new StringArrayArg();
        setParserProperty(s,arrayArg);
        return arrayArg;
    }

    @Override
    protected String parserKey() {
        return "[String]";
    }
}
