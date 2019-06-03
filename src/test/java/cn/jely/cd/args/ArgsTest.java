package cn.jely.cd.args;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ArgsTest {
    @Test
    public void parseOneBooleanParam() {
        ArgsParser argsParser = getArgParser();
        List<Arg> argList = argsParser.parse(new String[]{"-l", "true"});
        Assert.assertEquals(argList.size(),1);
        Assert.assertEquals(argList.get(0).getValue(),true);
    }
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void unknowOptionWhenParseThenThrowException() {
        ArgsParser argsParser = getArgParser();
        argsParser.parse(new String[]{"-x"});
    }
    private ArgsParser getArgParser() {
        return new ArgsParser();
    }

    @Test
    public void parseOneBooleanParamWithNoSetValue() {
        ArgsParser argsParser = getArgParser();
        List<Arg> argList = argsParser.parse(new String[]{"-l"});
        Assert.assertEquals(argList.size(),1);
        Assert.assertEquals(argList.get(0).getValue(),true);
    }
    @Test
    public void parseOneNumberParam() {
        ArgsParser argsParser = getArgParser();
        List<Arg> argList = argsParser.parse(new String[]{"-p", "80"});
        Assert.assertEquals(argList.size(),1);
        Assert.assertEquals(argList.get(0).getValue(),80);
    }
    @Test
    public void parseOneDirectoryParam() {
        ArgsParser argsParser = getArgParser();
        List<Arg> argList = argsParser.parse(new String[]{"-d", "/tmp"});
        Assert.assertEquals(argList.size(),1);
        Assert.assertEquals(argList.get(0).getValue(),"/tmp");
    }
    @Test
    public void allParams() {
        ArgsParser argsParser = getArgParser();
        List<Arg> argList = argsParser.parse(new String[]{"-d", "/tmp","-p","80","-l","true"});
        Assert.assertEquals(argList.size(),3);
    }
}
