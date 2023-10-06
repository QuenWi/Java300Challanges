package Find_a_Path_in_a_Matrix;

import Helpers.PrintArrayOrList;

public class Test_Find_a_Path_in_a_Matrix {

    public static void main(String[] args) {
        Integer[][] matrix = new Integer[][]{
                {1, 0, 1, 1, 1, 0, 1},
                {1, 0, 1, 0, 1, 1, 1},
                {1, 1, 1, 0, 0, 1, 1},
                {1, 0, 0, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 0, 0},
                {1, 1, 0, 0, 1, 1, 1},
                {1, 1, 1, 1, 1, 0, 1},
        };
        test(matrix);

        matrix = new Integer[][]{
                {1, 0, 1, 1, 1, 0, 1},
                {1, 0, 1, 0, 1, 1, 1},
                {1, 1, 1, 0, 0, 1, 1},
                {1, 0, 0, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 0, 0},
                {1, 1, 0, 0, 1, 0, 1},
                {1, 1, 1, 1, 1, 0, 1},
        };
        test(matrix);
    }

    private static void test(Integer[][] matrix){
        Integer[][] result = Find_a_Path_in_a_Matrix.find_a_Path_in_a_Matrix(matrix);

        System.out.println("Given: " + PrintArrayOrList.arrayMapAsMatrixToString(matrix));
        System.out.println("Result: " + PrintArrayOrList.arrayMapAsMatrixToString(result));
    }
}
