package cn.jely.cd;

public class FizzBuzz {
    public String convert(int i) {
        String result = "";
        if(i%3==0|| isContains(i, "3")) result +="Fizz";
        if(i%5==0|| isContains(i, "5")) result += "Buzz";
        if (result.isEmpty()) {
            return result + i;
        } else {
            return result;
        }
    }

    private boolean isContains(int i, String s) {
        return String.valueOf(i).contains(s);
    }
}
