package Set_Matrix_Zeroes;

import Helpers.PrintArrayOrList;

public class Test_Set_Matrix_Zeroes {

    public static void main(String[] args) {
        Integer[][] matrix = new Integer[][]{
                {1, 0, 1, 1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 1, 1, 0, 1, 1, 1},
                {1, 1, 0, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 0, 1, 1},
        };
        test(matrix);
    }

    private static void test(Integer[][] matrix){
        Integer[][] result = Set_Matrix_Zeroes.set_Matrix_Zeroes(matrix);

        System.out.println("Given: " + PrintArrayOrList.arrayMapAsMatrixToString(matrix));
        System.out.println("Result: " + PrintArrayOrList.arrayMapAsMatrixToString(result));
    }
}
