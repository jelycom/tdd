package cn.jely.cd.args;

public class DirectoryArgSchema extends ArgSchema<DirectoryArg> {
    @Override
    public DirectoryArg parse(String s) {
        DirectoryArg directoryArgParser = new DirectoryArg();
        setParserProperty(s, directoryArgParser);
        return directoryArgParser;
    }

    @Override
    protected String parserKey() {
        return "Directory";
    }
}
