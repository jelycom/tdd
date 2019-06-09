package cn.jely.cd.args;

public class StringArrayArg extends Arg<String[]> {
    public StringArrayArg() {
    }

    public StringArrayArg(String [] defaultValue, boolean nullAble) {
        super(defaultValue);
    }

    @Override
    public void setValue(String value) {
        this.value = valueFromStr(value);
    }

    @Override
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = valueFromStr(defaultValue);
    }

    private String[] valueFromStr(String defaultValue) {
        try {
            if (defaultValue == null || "".equals(defaultValue)||"[]".equals(defaultValue)) {
                return new String[]{};
            } else {
                return defaultValue.split(",");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("InCorrect Param Value,like:[a,b,c,d]");
        }
    }

}
