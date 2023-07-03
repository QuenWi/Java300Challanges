package Increasing_Triplet_Subsequence;

import Helpers.PrintArrayOrList;

public class Test_Increasing_Triplet_Subsequence {

    public static void main(String[] args) {
        test(new Double[]{9d, 10d, 7d, 8d, 4d, 5d, 2d, 3d, 1d, 0d});
        test(new Double[]{9d, 10d, 7d, 8d, 4d, 5d, 2d, 3d, 4d});
    }

    private static void test(Double[] array){
        Boolean result = Increasing_Triplet_Subsequence.increasing_Triplet_Subsequence(array);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Result: " + result);
    }
}
