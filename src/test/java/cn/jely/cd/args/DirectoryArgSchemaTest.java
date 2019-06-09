package cn.jely.cd.args;

import org.testng.Assert;

public class DirectoryArgSchemaTest extends ArgSchemaTest{
    @Override
    public void schemaSupport() {
        ArgSchema argSchema = getArgSchema();
        boolean support = argSchema.support("-d:Directory:/tmp");
        Assert.assertEquals(support,true);
    }

    private DirectoryArgSchema getArgSchema() {
        return new DirectoryArgSchema();
    }

    @Override
    public void schemaDefaultValue() {
        DirectoryArgSchema argSchema = getArgSchema();
        DirectoryArg parser = argSchema.parse("-d:Directory:/tmp");
        Assert.assertEquals(parser.defaultValue,"/tmp");
    }
    @Override
    public void schemaNoDefaultValue() {
        DirectoryArgSchema argSchema = getArgSchema();
        DirectoryArg parser = argSchema.parse("-d:Directory");
        Assert.assertNull(parser.defaultValue);
    }
}
