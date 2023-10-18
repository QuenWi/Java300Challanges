package Spiral_Matrix_II;

import Helpers.PrintArrayOrList;

public class Test_Spiral_Matrix_II {

    public static void main(String[] args) {
        test(3);
        test(5);
    }

    private static void test(Integer integer){
        Integer[][] result = Spiral_Matrix_II.spiral_Matrix_II(integer);

        System.out.println("Given: " + integer.toString());
        System.out.println("Result: " + PrintArrayOrList.arrayMapAsMatrixToString(result));
    }
}
