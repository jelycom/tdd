package cn.jely.cd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FizzBuzzTest {
    @DataProvider
    public Object[][] param() {
        return new Object[][]{{1, "1"}, {3, "Fizz"}};
    }
    @Test
    public void fizzBuzzTest(int i,String expected) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(i);
        Assert.assertEquals(result, expected);
    }
}
