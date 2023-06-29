package Wiggle_Sort;

import Helpers.PrintArrayOrList;

public class Test_Wiggle_Sort {

    public static void main(String[] args) {
        test(new Double[]{1d, -3d, -3.4d, 6d, 7.3d, 8d, 9.2d, 1.2d, 1.1d, 1d, 3.4d, 2.2d, 10d, -2d, -2.3d, -4d});
    }

    private static void test(Double[] array){
        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        Wiggle_Sort.wiggle_Sort(array);
        System.out.println("Result: " + PrintArrayOrList.arrayToString(array));
    }
}
