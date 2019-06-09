package cn.jely.cd.args;

import org.testng.Assert;

public class IntegerArrayArgTest extends ArgTest {

    @Override
    public void newArgSetDefaultValueWhenGetValueThenReturnDefaultValue() {
        IntegerArrayArg arg = getArg();
        arg.setDefaultValue("");
        Assert.assertEquals(arg.getValue(),new String[]{});
    }

    @Override
    public void setCorrectValueWhenGetValueThenReturnCorrectValue() {
        IntegerArrayArg arg = getArg();
        arg.setValue("1,2");
        Assert.assertEquals(arg.getValue(),new Integer[]{1,2});
    }

    @Override
    public void setInCorrectValueThenThrowException() {
        IntegerArrayArg arg = getArg();
        arg.setValue("a,b");
    }

    @Override
    protected IntegerArrayArg getArg() {
        return new IntegerArrayArg();
    }
}
