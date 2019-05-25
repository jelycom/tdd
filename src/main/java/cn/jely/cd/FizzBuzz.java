package cn.jely.cd;

public class FizzBuzz {
    public String convert(int i) {
        String result = "";
        if(i%3==0||String.valueOf(i).contains("3")) result +="Fizz";
        if(i%5==0) result += "Buzz";
        if (result.isEmpty()) {
            return result + i;
        } else {
            return result;
        }
    }
}
