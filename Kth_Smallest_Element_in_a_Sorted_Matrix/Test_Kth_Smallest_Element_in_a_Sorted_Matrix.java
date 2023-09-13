package Kth_Smallest_Element_in_a_Sorted_Matrix;

import Helpers.PrintArrayOrList;

public class Test_Kth_Smallest_Element_in_a_Sorted_Matrix {

    public static void main(String[] args) {
        Long[][] matrix = new Long[][]{
                {1l, 4l, 7l, 11l, 15l},
                {2l, 5l, 8l, 12l, 19l},
                {3l, 6l, 9l, 16l, 22l},
                {10l, 13l, 14l, 17l, 24l},
                {18l, 21l, 23l, 26l, 30l}
        };
        test(matrix, 10);
        test(matrix, 0);
        test(matrix, 24);
    }

    private static void test(Long[][] matrix, Integer wanted){
        Long result = Kth_Smallest_Element_in_a_Sorted_Matrix.kth_Smallest_Element_in_a_Sorted_Matrix(matrix, wanted);

        System.out.println("Given: " + wanted + " and " + PrintArrayOrList.arrayMatrixToString(matrix));
        System.out.println("Result: " + result.toString());
    }
}
