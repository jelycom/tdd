package cn.jely.cd.args;

public class PortArg extends Arg<Integer> {
    public PortArg() {
    }

    public PortArg(Integer defaultValue, boolean nullAble) {
        super(defaultValue);
    }

    @Override
    public void setValue(String value) {
        try {
            this.value = Integer.valueOf(value);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("InCorrect Param Value,like:80");
        }
    }

    @Override
    public void setDefaultValue(String defaultValue) {
        try {
            this.defaultValue = Integer.valueOf(defaultValue);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("InCorrect Param Value,like:80");
        }
    }

}
