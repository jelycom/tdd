package cn.jely.cd.args;

import org.testng.Assert;

public class IntegerArrayArgSchemaTest extends ArgSchemaTest{
    @Override
    public void schemaSupport() {
        ArgSchema argSchema = getArgSchema();
        boolean support = argSchema.support("-x:[Integer]:[]");
        Assert.assertEquals(support,true);
    }
    @Override
    public void schemaDefaultValue() {
        IntegerArrayArgSchema argSchema = getArgSchema();
        IntegerArrayArg parser = argSchema.parse("-x:[Integer]:[]");
        Assert.assertEquals(parser.defaultValue, new Integer[]{});
    }

    private IntegerArrayArgSchema getArgSchema() {
        return new IntegerArrayArgSchema();
    }

    @Override
    public void schemaNoDefaultValue() {
        IntegerArrayArgSchema argSchema = getArgSchema();
        IntegerArrayArg parser = argSchema.parse("-x:[Integer]");
        Assert.assertNull(parser.defaultValue);
    }

}
