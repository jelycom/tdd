package cn.jely.cd.args;

import org.testng.Assert;

public class BooleanArgTest extends ArgTest {

    @Override
    public void newArgSetDefaultValueWhenGetValueThenReturnDefaultValue() {
        BooleanArg arg = (BooleanArg) getArg();
        arg.setDefaultValue("false");
        Assert.assertEquals(arg.getValue(),Boolean.FALSE);
    }

    @Override
    public void setCorrectValueWhenGetValueThenReturnCorrectValue() {
        BooleanArg arg = (BooleanArg) getArg();
        arg.setValue("true");
        Assert.assertEquals(arg.getValue(),Boolean.TRUE);
    }

    @Override
    public void setInCorrectValueThenThrowException() {
        BooleanArg arg = (BooleanArg) getArg();
        arg.setValue("ture");
    }

    @Override
    public void valueIsNullButCannotBeNull() {
        BooleanArg booleanArg = (BooleanArg) getArg();
        booleanArg.valid();
    }

    @Override
    protected Arg getArg() {
        return new BooleanArg();
    }
}
