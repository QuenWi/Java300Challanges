package Merge_K_Sorted_Arrays_in_Java;

import Helpers.PrintArrayOrList;

public class Test_Merge_K_Sorted_Arrays_in_Java {

    public static void main(String[] args) {
        test(new Integer[][]{
                {1, 2, 3, 16, 17, 18},
                {2, 3, 4, 18, 19, 20},
                {7, 8, 12, 14},
                {3}
        });
    }

    private static void test(Integer[][] arrays){
        Integer[] result = Merge_K_Sorted_Arrays_in_Java.merge_K_Sorted_Arrays_in_Java(arrays);

        System.out.println("Given: " + PrintArrayOrList.arrayMatrixToString(arrays));
        System.out.println("Result: " + PrintArrayOrList.arrayToString(result));
    }
}
