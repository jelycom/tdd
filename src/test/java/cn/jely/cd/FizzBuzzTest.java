package cn.jely.cd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FizzBuzzTest {
    @DataProvider
    public Object[][] param() {
        return new Object[][]{{1, "1"}, {3, "Fizz"},{5,"Buzz"},{15,"FizzBuzz"},{31,"Fizz"},{52,"Buzz"},{35,"FizzBuzz"}};
    }
    @Test(dataProvider = "param")
    public void fizzBuzzTest(int i,String expected) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(i);
        Assert.assertEquals(result, expected);
    }
}
