package cn.jely.cd.args;

public class BooleanArg extends Arg<Boolean> {
    public static final String TRUE = "true";
    public static final String FALSE = "false";

    public BooleanArg() {
    }

    public BooleanArg(Boolean defaultValue, boolean nullAble) {
        super(defaultValue);
    }

    @Override
    public void setValue(String value) {
        if (TRUE.equals(value) || FALSE.equals(value)) {
            this.value = Boolean.valueOf(value);
        } else {
            throw new IllegalArgumentException(String.format("InCorrect Param value:%s,like:true or false",value));
        }
    }

    @Override
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = Boolean.valueOf(defaultValue);
    }

}
