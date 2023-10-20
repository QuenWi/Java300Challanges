package Range_Sum_Query_2D_Immutable;

import Helpers.PrintArrayOrList;

public class Test_Range_Sum_Query_2D_Immutable {

    public static void main(String[] args) {
        Integer[][] matrix = new Integer[][]{
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30},
        };
        test(matrix, 0, 0, 2, 1);
        test(matrix, 1, 2, 1, 2);
        test(matrix, 5, 1, 1, 4);
    }

    private static void test(Integer[][] matrix, Integer pos1_x, Integer pos1_y, Integer pos2_x, Integer pos2_y){
        Integer result = Range_Sum_Query_2D_Immutable.range_Sum_Query_2D_Immutable(matrix, pos1_x, pos1_y, pos2_x, pos2_y);

        System.out.println(String.format("Given: %s, (%s, %s) and (%s, %s)", PrintArrayOrList.arrayMapAsMatrixToString(matrix), pos1_x.toString(), pos1_y.toString(), pos2_x.toString(), pos2_y.toString()));
        System.out.println("Result: " + result.toString());
    }
}
