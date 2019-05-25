import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzBuzzTest {
    @Test
    public void when_1_then_str_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(1);
        Assert.assertEquals(result, "1");
    }
}
