package Super_Ugly_Number;

import Helpers.PrintArrayOrList;

public class Test_Super_Ugly_Number {

    public static void main(String[] args) {
        test(new Integer[]{6, 5}, 5);
        test(new Integer[]{6, 5, 4}, 5);
        test(new Integer[]{6, 5, 4}, 9);
        test(new Integer[]{6, 7, 9, 11}, 200);
    }

    private static void test(Integer[] array, Integer number){
        Integer result = Super_Ugly_Number.super_Ugly_Number(array, number);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array) + ", " + number.toString());
        System.out.println("Result: " + result.toString());
    }
}
