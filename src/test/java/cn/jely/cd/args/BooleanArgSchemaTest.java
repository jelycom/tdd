package cn.jely.cd.args;

import org.testng.Assert;

public class BooleanArgSchemaTest extends ArgSchemaTest{
    @Override
    public void schemaSupport() {
        ArgSchema argSchema = new BooleanArgSchema();
        boolean support = argSchema.support("-l:Boolean:false");
        Assert.assertEquals(support,true);
    }
    @Override
    public void booleanSchemaDefaultValue() {
        BooleanArgSchema argSchema = new BooleanArgSchema();
        BooleanArg parser = argSchema.parse("-l:Boolean:false");
        Assert.assertFalse(parser.defaultValue);
    }
    @Override
    public void booleanSchemaNoDefaultValue() {
        BooleanArgSchema argSchema = new BooleanArgSchema();
        BooleanArg parser = argSchema.parse("-l:Boolean");
        Assert.assertNull(parser.defaultValue);
    }
}
