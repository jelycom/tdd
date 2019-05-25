package cn.jely.cd;

public class FizzBuzzGame {
    public static void main(String[] args) {
        FizzBuzz  fizzBuzz = new FizzBuzz();
        for (int i = 0; i < 100; i++) {
            System.out.println(fizzBuzz.convert(i + 1));
        }
    }
}
