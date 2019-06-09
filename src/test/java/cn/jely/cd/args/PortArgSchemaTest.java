package cn.jely.cd.args;

import org.testng.Assert;

public class PortArgSchemaTest extends ArgSchemaTest{
    @Override
    public void schemaSupport() {
        ArgSchema argSchema = getArgSchema();
        boolean support = argSchema.support("-p:Port:80");
        Assert.assertEquals(support,true);
    }
    @Override
    public void schemaDefaultValue() {
        PortArgSchema argSchema = getArgSchema();
        PortArg parser = argSchema.parse("-p:Port:80");
        Assert.assertEquals(parser.defaultValue, Integer.valueOf(80));
    }

    private PortArgSchema getArgSchema() {
        return new PortArgSchema();
    }

    @Override
    public void schemaNoDefaultValue() {
        PortArgSchema argSchema = getArgSchema();
        PortArg parser = argSchema.parse("-p:Port");
        Assert.assertNull(parser.defaultValue);
    }

}
