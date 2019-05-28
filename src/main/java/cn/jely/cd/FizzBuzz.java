package cn.jely.cd;

public class FizzBuzz {

    public static final String FIZZ_STR = "Fizz";
    public static final String BUZZ_Str = "Buzz";
    public static final int TREE = 3;
    public static final int FIVE = 5;
    public static final String FIVE_STR = "5";
    public static final String THREE_STR = "3";

    public static String covert(int i) {
        StringBuilder sb = new StringBuilder();
        String iStr = String.valueOf(i);
        if(exactDivision(i, TREE) || isContains(iStr, THREE_STR)) sb.append(FIZZ_STR);
        if(exactDivision(i, FIVE) || isContains(iStr, FIVE_STR)) sb.append(BUZZ_Str);
        boolean notMatch = sb.length() == 0;
        if(notMatch) sb.append(i);
        return sb.toString();
    }

    private static boolean exactDivision(int value, int divisor) {
        return value % divisor == 0;
    }

    private static boolean isContains(String iStr, String s) {
        return iStr.contains(s);
    }
}
