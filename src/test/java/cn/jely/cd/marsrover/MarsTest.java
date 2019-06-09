package cn.jely.cd.marsrover;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MarsTest {
    @Test
    public void testMarsInitCorrect() {
        Mars mars = new Mars(1000,1000);
        Assert.assertEquals(mars.getMaxX(),1000);
        Assert.assertEquals(mars.getMaxY(),1000);
    }

    @Test(expectedExceptions = {IllegalArgumentException.class})
    public void testInitXError() {
        Mars mars = new Mars(-1, 0);
    }

    @Test(expectedExceptions = {IllegalArgumentException.class})
    public void testInitYError() {
        Mars mars = new Mars(0, -1);
    }
}
