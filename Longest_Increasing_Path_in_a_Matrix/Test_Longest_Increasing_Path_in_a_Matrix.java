package Longest_Increasing_Path_in_a_Matrix;

import Helpers.PrintArrayOrList;

import java.util.Random;

public class Test_Longest_Increasing_Path_in_a_Matrix {

    public static void main(String[] args) {
        /*Float[][] matrix = new Float[][]{
                {9f, 9f, 4f},
                {6f, 6f, 8f},
                {2f, 1f, 1f}
        };*/
        Float[][] matrix = new Float[5][5];
        Random r = new Random();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = 0 + r.nextFloat() * (5 - 0);
            }
        }
        test(matrix);
    }

    private static void test(Float[][] matrix){
        Integer result = Longest_Increasing_Path_in_a_Matrix.longest_Increasing_Path_in_a_Matrix(matrix);

        System.out.println("Given: " + PrintArrayOrList.arrayMatrixToString(matrix));
        System.out.println("Result: " + result.toString());
    }
}
