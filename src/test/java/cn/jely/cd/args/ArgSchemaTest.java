package cn.jely.cd.args;

import org.testng.annotations.Test;

public abstract class ArgSchemaTest {
    @Test
    public abstract void schemaSupport();

    @Test
    public abstract void schemaDefaultValue();

    @Test
    public abstract void schemaNoDefaultValue();
}
