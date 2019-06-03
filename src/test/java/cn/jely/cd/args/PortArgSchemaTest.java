package cn.jely.cd.args;

import org.testng.Assert;

public class PortArgSchemaTest extends ArgSchemaTest{
    @Override
    public void schemaSupport() {
        ArgSchema argSchema = new PortArgSchema();
        boolean support = argSchema.support("-p:Directory:/tmp");
        Assert.assertEquals(support,true);
    }
    @Override
    public void booleanSchemaDefaultValue() {
        BooleanArgSchema argSchema = new BooleanArgSchema();
        BooleanArg parser = argSchema.parse("-p:Directory:/tmp");
        Assert.assertEquals(parser.defaultValue,Boolean.FALSE);
    }
    @Override
    public void booleanSchemaNoDefaultValue() {
        BooleanArgSchema argSchema = new BooleanArgSchema();
        BooleanArg parser = argSchema.parse("-p:Directory");
        Assert.assertNull(parser.defaultValue);
    }
}
