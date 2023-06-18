package Minimum_Size_Subarray_Sum;

import Helpers.PrintArrayOrList;

public class Test_Minimum_Size_Subarray_Sum {

    public static void main(String[] args) {
        /*Float[] array = {3.4f, 1.4f, 4.9f, 3.2f, 0.3f, 1f, 4.3f, 2.7f, 2.3f, 1.2f, 3.5f, 3f, 4.2f, 2.3f, 4.1f, 0.3f, 2.6f};
        Float sum = 14f;
        Float[] result = Minimum_Size_Subarray_Sum.minimum_Size_Subarray_Sum(array, sum);*/

        Double[] array = {3.4d, 1.4d, 4.9d, 3.2d, 0.3d, 1d, 4.3d, 2.7d, 2.3, 1.2d, 3.5d, 3d, 4.2d, 2.3d, 4.1d, 0.3d, 2.6d};
        Double sum = 14d;
        Double[] result = Minimum_Size_Subarray_Sum.minimum_Size_Subarray_Sum(array, sum);

        System.out.println("FullArray: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Minimum Sum: " + sum.toString());
        System.out.println("SubArray: " + PrintArrayOrList.arrayToString(result));
    }
}
