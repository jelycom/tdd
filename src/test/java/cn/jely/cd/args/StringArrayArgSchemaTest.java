package cn.jely.cd.args;

import org.testng.Assert;

public class StringArrayArgSchemaTest extends ArgSchemaTest{
    @Override
    public void schemaSupport() {
        ArgSchema argSchema = getArgSchema();
        boolean support = argSchema.support("-g:[String]:[]");
        Assert.assertEquals(support,true);
    }
    @Override
    public void schemaDefaultValue() {
        StringArrayArgSchema argSchema = getArgSchema();
        StringArrayArg parser = argSchema.parse("-g:[String]:[]");
        Assert.assertEquals(parser.defaultValue, new String[]{});
    }

    private StringArrayArgSchema getArgSchema() {
        return new StringArrayArgSchema();
    }

    @Override
    public void schemaNoDefaultValue() {
        StringArrayArgSchema argSchema = getArgSchema();
        StringArrayArg parser = argSchema.parse("-g:[String]");
        Assert.assertNull(parser.defaultValue);
    }

}
