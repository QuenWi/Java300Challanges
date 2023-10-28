package Sparse_Matrix_Multiplication;

import Helpers.PrintArrayOrList;

public class Test_Sparse_Matrix_Multiplication {

    public static void main(String[] args) {
        Double[][] matrix1 = new Double[][]{
                {1d, 2d, 3d},
                {4d, 5d, 6d}
        };
        Double[][] matrix2 = new Double[][]{
                {1d, 2d},
                {3d, 4d},
                {5d, 6d}
        };
        test(matrix1, matrix2);
    }

    private static void test(Double[][] matrix1, Double[][] matrix2){
        Double[][] result = Sparse_Matrix_Multiplication.sparse_Matrix_Multiplication(matrix1, matrix2);

        System.out.println("Given: " + PrintArrayOrList.arrayMapAsMatrixToString(matrix1) + " and " + PrintArrayOrList.arrayMapAsMatrixToString(matrix2));
        System.out.println("Result: " + PrintArrayOrList.arrayMapAsMatrixToString(result));
    }
}
