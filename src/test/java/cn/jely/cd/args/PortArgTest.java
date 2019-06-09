package cn.jely.cd.args;

import org.testng.Assert;

public class PortArgTest extends ArgTest {

    @Override
    public void newArgSetDefaultValueWhenGetValueThenReturnDefaultValue() {
        PortArg arg = (PortArg) getArg();
        arg.setDefaultValue("0");
        Assert.assertEquals(arg.getValue(),Integer.valueOf(0));
    }

    @Override
    public void setCorrectValueWhenGetValueThenReturnCorrectValue() {
        PortArg arg = (PortArg) getArg();
        arg.setValue("80");
        Assert.assertEquals(arg.getValue(),Integer.valueOf(80));
    }

    @Override
    public void setInCorrectValueThenThrowException() {
        PortArg arg = (PortArg) getArg();
        arg.setValue("abc");
    }

    @Override
    protected Arg getArg() {
        return new PortArg();
    }
}
