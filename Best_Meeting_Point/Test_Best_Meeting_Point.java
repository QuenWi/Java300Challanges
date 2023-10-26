package Best_Meeting_Point;

import Helpers.PrintArrayOrList;

public class Test_Best_Meeting_Point {

    public static void main(String[] args) {
        Integer[][] matrix = new Integer[][]{
                {0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 1},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0}
        };
        Integer[][] matrix2 = new Integer[][]{
                {0, 1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 1},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0}
        };
        test(matrix);
        test(matrix2);
    }

    private static void test(Integer[][] matrix){
        Integer result = Best_Meeting_Point.best_Meeting_Point(matrix);

        System.out.println("Given: " + PrintArrayOrList.arrayMapAsMatrixToString(matrix));
        System.out.println("Result: " + result.toString());
    }
}
