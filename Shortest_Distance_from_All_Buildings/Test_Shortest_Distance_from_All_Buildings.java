package Shortest_Distance_from_All_Buildings;

import Helpers.PrintArrayOrList;

public class Test_Shortest_Distance_from_All_Buildings {

    public static void main(String[] args) {
        Integer[][] matrix1 = new Integer[][]{
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 2, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 2, 0, 1, 0, 0, 0},
                {0, 1, 2, 0, 0, 0, 0, 0},
                {2, 0, 0, 0, 0, 0, 1, 0},
                {2, 0, 1, 2, 0, 0, 0, 0},
        };
        Integer[][] matrix2 = new Integer[][]{
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 2, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 2, 0, 1, 0, 0, 0},
                {0, 1, 2, 0, 0, 0, 0, 0},
                {2, 0, 2, 0, 0, 0, 1, 0},
                {2, 0, 1, 2, 0, 0, 0, 0},
        };
        Integer[][] matrix3 = new Integer[][]{
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 2, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 2, 0, 1, 0, 0, 0},
                {0, 0, 2, 2, 0, 1, 0, 0},
                {2, 0, 2, 0, 1, 0, 0, 0},
                {2, 0, 0, 2, 0, 0, 0, 0},
        };
        test(matrix1);
        test(matrix2);
        test(matrix3);
    }

    private static void test(Integer[][] matrix){
        Integer result = Shortest_Distance_from_All_Buildings.shortest_Distance_from_All_Buildings(matrix);

        System.out.println("Given: " + PrintArrayOrList.arrayMapAsMatrixToString(matrix));
        System.out.println("Result: " + result.toString());
    }
}
