package cn.jely.cd.args;

public abstract class Arg<T> {
    private String key;
    protected T value;
    protected T defaultValue;
    private boolean nullAble;

    public Arg() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setNullAble(boolean nullAble) {
        this.nullAble = nullAble;
    }

    public Arg(T defaultValue) {
        this.defaultValue = defaultValue;
    }

    public T getValue() {
        return this.value == null ? this.defaultValue : this.value;
    }

    public abstract void setValue(String value);

    public abstract void setDefaultValue(String defaultValue);

    public void valid() {
        if (!nullAble && getValue() == null) {
            throw new IllegalStateException("value can't be null!");
        }
    }
}
