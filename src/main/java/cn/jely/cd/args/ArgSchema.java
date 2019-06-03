package cn.jely.cd.args;

public abstract class ArgSchema<T> {
    public abstract T parse(String s);

    public boolean support(String s) {
        String[] strs = split(s);
        return parserKey().equals(strs[1]);
    }

    protected void setParserProperty(String s, Arg arg) {
        String[] strs = split(s);
        if (strs.length > 0) {
            arg.setKey(strs[0]);
        }
        if (strs.length > 2) {
            arg.setDefaultValue(strs[2]);
        }
    }

    protected abstract String parserKey();

    public String[] split(String s) {
        return s.split(":");
    }
}
