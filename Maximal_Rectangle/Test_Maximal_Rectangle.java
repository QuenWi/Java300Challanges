package Maximal_Rectangle;

import Helpers.PrintArrayOrList;

public class Test_Maximal_Rectangle {

    public static void main(String[] args) {
        Integer[][] matrix = new Integer[][]{
                {0, 1, 0, 0, 1, 0, 0, 0, 1, 0},
                {1, 1, 1, 1, 1, 0, 1, 0, 1, 0},
                {1, 0, 1, 0, 1, 0, 1, 1, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 0, 0},
                {0, 1, 0, 1, 0, 1, 0, 1, 0, 0},
                {1, 1, 0, 1, 0, 1, 0, 1, 1, 1},
                {1, 1, 0, 1, 0, 0, 0, 1, 0, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 0, 0}
        }; //7*5
        test(matrix);
    }

    private static void test(Integer[][] matrix){
        Integer result = Maximal_Rectangle.maximal_Rectangle(matrix);

        System.out.println("Given: ");
        System.out.println(PrintArrayOrList.arrayMapAsMatrixToString(matrix));
        System.out.println("Result: " + result.toString());
    }
}
