package Search_a_2D_Matrix_II;

import Helpers.PrintArrayOrList;

public class Test_Search_a_2D_Matrix_II {

    public static void main(String[] args) {
        Float[][] matrix = new Float[][]{
                {1f, 4f, 7f, 11f, 15f},
                {2f, 5f, 8f, 12f, 19f},
                {3f, 6f, 9f, 16f, 22f},
                {10f, 13f, 14f, 17f, 24f},
                {18f, 21f, 23f, 26f, 30f}
        };
        test(matrix, 24f);
        test(matrix, 30f);
        test(matrix, 18f);
        test(matrix, 1f);
        test(matrix, 0f);
        test(matrix, 20f);
        test(matrix, 31f);
        test(matrix, 5f);
    }

    private static void test(Float[][] matrix, Float wanted){
        Boolean result = Search_a_2D_Matrix_II.search_a_2D_Matrix_II(matrix, wanted);

        System.out.println("Given: " + wanted.toString() + " and " + PrintArrayOrList.arrayMatrixToString(matrix));
        System.out.println("Result: " + result.toString());
    }
}
