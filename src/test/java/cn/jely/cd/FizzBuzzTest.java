package cn.jely.cd;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FizzBuzzTest {
    @DataProvider()
    public Object[][] params() {
        return new Object[][]{{1,"1"},{3,"Fizz"},{5,"Buzz"},{15,"FizzBuzz"},{31,"Fizz"},{52,"Buzz"},{53,"FizzBuzz"}};
    }
    @Test(dataProvider = "params")
    public void testFizzBuzz(int i, String c) {
        String result = FizzBuzz.covert(i);
        Assert.assertEquals(result,c);
    }
}
