package cn.jely.cd.args;

import org.testng.annotations.Test;

public abstract class ArgTest {
    @Test
    public abstract void newArgSetDefaultValueWhenGetValueThenReturnDefaultValue();
    @Test
    public abstract void setCorrectValueWhenGetValueThenReturnCorrectValue();
    @Test(expectedExceptions = {IllegalArgumentException.class})
    public abstract void setInCorrectValueThenThrowException();

    @Test(expectedExceptions = {IllegalStateException.class})
    public void valueIsNullButCannotBeNull() {
        Arg arg = getArg();
        arg.valid();
    }

    protected abstract <T extends Arg> T getArg();
}
