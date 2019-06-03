package cn.jely.cd.args;

import org.testng.Assert;

public class PortArgTest extends ArgTest {

    @Override
    public void newArgSetDefaultValueWhenGetValueThenReturnDefaultValue() {
        PortArg arg = (PortArg) getArgParser();
        arg.setDefaultValue("0");
        Assert.assertEquals(arg.getValue(),Integer.valueOf(0));
    }

    @Override
    public void setCorrectValueWhenGetValueThenReturnCorrectValue() {
        PortArg arg = (PortArg) getArgParser();
        arg.setValue("80");
        Assert.assertEquals(arg.getValue(),Integer.valueOf(80));
    }

    @Override
    public void setInCorrectValueThenThrowException() {
        PortArg arg = (PortArg) getArgParser();
        arg.setValue("abc");
    }

    @Override
    protected Arg getArgParser() {
        return new PortArg();
    }
}
