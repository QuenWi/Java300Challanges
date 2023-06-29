package Subarray_Sum_Equals_K;

import Helpers.PrintArrayOrList;

public class Test_Subarray_Sum_Equals_K {

    public static void main(String[] args) {
        test(new Double[] {0d, 1d, 2d, 3d, 4d, 5d, 6d, 7d, 8d, 9d, 10d}, 21d);
    }

    private static void test(Double[] array, Double sum){
        Integer result = Subarray_Sum_Equals_K.subarray_Sum_Equals_K(array, sum);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Result for " + sum.toString() + ": " + result.toString());
    }
}
