package Max_Sum_of_Rectangle_No_Larger_Than_K;

import Helpers.PrintArrayOrList;

public class Test_Max_Sum_of_Rectangle_No_Larger_Than_K {

    public static void main(String[] args) {
        test(new Double[][]{
                {2.2d, 4.6d, -3.4d, 3.1d, 0.3d, 6.3d},
                {3.7d, -1.6d, 2.3d, 0.1d, -1.2d, 2.0d},
                {7.5d, -3.9d, 1.1d, 4.3d, -0.2d, 3.6d},
                {5.5d, 0.4d, -2.2d, -1.2d, -1.7d, -0.5d}
        }, 8d);
        test(new Double[][]{
                {2.2d, 4.6d, -3.4d, 3.1d, 0.3d, 6.3d},
                {3.7d, -1.5d, 2.3d, 0.1d, -1.2d, 2.0d}, //-1.6 -> -1.5
                {7.5d, -3.9d, 1.1d, 4.3d, -0.2d, 3.6d},
                {5.5d, 0.4d, -2.2d, -1.2d, -1.7d, -0.5d}
        }, 8d);
    }

    private static void test(Double[][] matrix, Double wanted){
        Double result = Max_Sum_of_Rectangle_No_Larger_Than_K.max_Sum_of_Rectangle_No_Larger_Than_K(matrix, wanted);

        System.out.println("Given: " + PrintArrayOrList.arrayMatrixToString(matrix) + " and " + wanted.toString());
        System.out.println("Result: " + result.toString());
    }
}
