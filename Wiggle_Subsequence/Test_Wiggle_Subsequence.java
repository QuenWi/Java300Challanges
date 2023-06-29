package Wiggle_Subsequence;

import Helpers.PrintArrayOrList;

public class Test_Wiggle_Subsequence {

    public static void main(String[] args) {
        test(new Double[] {1d, -3d, -3.4d, 6d, 7.3d, 8d, 9.2d, 1.2d, 1.1d, 1d, 3.4d, 2.2d, 10d, -2d, -2.3d, -4d});
    }

    private static void test(Double[] array){
        Integer result = Wiggle_Subsequence.wiggle_Subsequence(array);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Result: " + result.toString());
    }
}
