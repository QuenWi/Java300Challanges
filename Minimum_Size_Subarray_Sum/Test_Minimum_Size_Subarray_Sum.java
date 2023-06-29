package Minimum_Size_Subarray_Sum;

import Helpers.PrintArrayOrList;

public class Test_Minimum_Size_Subarray_Sum {

    public static void main(String[] args) {
        test(new Float[] {3.4f, 1.4f, 4.9f, 3.2f, 0.3f, 1f, 4.3f, 2.7f, 2.3f, 1.2f, 3.5f, 3f, 4.2f, 2.3f, 4.1f, 0.3f, 2.6f},14f);
    }

    private static void test(Float[] array, Float sum){
        Float[] result = Minimum_Size_Subarray_Sum.minimum_Size_Subarray_Sum(array, sum);

        System.out.println("FullArray: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Minimum Sum: " + sum.toString());
        System.out.println("SubArray: " + PrintArrayOrList.arrayToString(result));
    }
}
