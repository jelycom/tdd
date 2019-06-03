package cn.jely.cd.args;

import org.testng.Assert;

public class DirectoryArgTest extends ArgTest {

    @Override
    public void newArgSetDefaultValueWhenGetValueThenReturnDefaultValue() {
        DirectoryArg arg = (DirectoryArg) getArgParser();
        arg.setDefaultValue("");
        Assert.assertEquals(arg.getValue(),"");
    }

    @Override
    public void setCorrectValueWhenGetValueThenReturnCorrectValue() {
        DirectoryArg arg = (DirectoryArg) getArgParser();
        arg.setValue("/tmp");
        Assert.assertEquals(arg.getValue(),"/tmp");
    }

    @Override
    public void setInCorrectValueThenThrowException() {
        DirectoryArg arg = (DirectoryArg) getArgParser();
        arg.setValue("true");
    }

    @Override
    protected Arg getArgParser() {
        return new DirectoryArg();
    }

}
