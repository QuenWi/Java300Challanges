package Ugly_Number_II;

public class Test_Ugly_Number_II {

    public static void main(String[] args) {
        test(1);
        test(3);
        test(8);
        test(12);
        test(20);
        test(901);
    }

    private static void test(Integer number){
        Integer result = Ugly_Number_II.ugly_Number_II(number);

        System.out.println("Given: " + number.toString());
        System.out.println("Result: " + result.toString());
    }
}
