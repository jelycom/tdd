package cn.jely.cd.args;

import java.io.File;

public class DirectoryArg extends Arg<String> {

    public DirectoryArg() {
    }

    public DirectoryArg(String defaultValue, boolean nullAble) {
        super(defaultValue);
    }

    @Override
    public void setValue(String value) {
        validStr(value);
        this.value = value;
    }

    private void validStr(String value) {
        File file = new File(value);
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("InCorrect Param Value,like:/directory or d:\\\\directory");
        }
    }

    @Override
    public void setDefaultValue(String defaultValue) {
//        validStr(defaultValue);
        this.defaultValue = defaultValue;
    }
}
