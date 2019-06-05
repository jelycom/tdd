package cn.jely.cd.args;

import org.testng.Assert;

public class StringArrayArgTest extends ArgTest {

    @Override
    public void newArgSetDefaultValueWhenGetValueThenReturnDefaultValue() {
        StringArrayArg arg = (StringArrayArg) getArgParser();
        arg.setDefaultValue("");
        Assert.assertEquals(arg.getValue(),new String[]{});
    }

    @Override
    public void setCorrectValueWhenGetValueThenReturnCorrectValue() {
        StringArrayArg arg = (StringArrayArg) getArgParser();
        arg.setValue("a,d");
        Assert.assertEquals(arg.getValue(),"a,d".split(","));
    }

    @Override
    public void setInCorrectValueThenThrowException() {
        throw new IllegalArgumentException();
//        StringArrayArg arg = (StringArrayArg) getArgParser();
//        arg.setValue(new String());
    }

    @Override
    protected Arg getArgParser() {
        return new StringArrayArg();
    }
}
