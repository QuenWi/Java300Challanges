package Ugly_Number;

public class Test_Ugly_Number {

    public static void main(String[] args) {
        test(30);
        test(7);
        test(14);
        test(11);
        test(12);
        test(9001);
    }

    private static void test(Integer number){
        Boolean result = Ugly_Number.ugly_Number(number);

        System.out.println("Given: " + number.toString());
        System.out.println("Result: " + result.toString());
    }
}
