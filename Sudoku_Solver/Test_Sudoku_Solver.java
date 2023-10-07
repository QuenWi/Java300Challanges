package Sudoku_Solver;

import Helpers.PrintArrayOrList;

public class Test_Sudoku_Solver {

    public static void main(String[] args) {
        Integer[][] matrix = new Integer[][]{
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9},
        };
        test(matrix);
    }

    private static void test(Integer[][] matrix){
        Integer[][] result = Sudoku_Solver.sudoku_Solver(matrix);

        System.out.println("Given: " + PrintArrayOrList.arrayMapAsMatrixToString(matrix));
        System.out.println("Result: " + PrintArrayOrList.arrayMapAsMatrixToString(result));
    }
}
