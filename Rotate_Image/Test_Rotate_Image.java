package Rotate_Image;

import Helpers.PrintArrayOrList;

public class Test_Rotate_Image {

    public static void main(String[] args) {
        Float[][] matrix = new Float[][]{
                {1f, 2f, 3f, 4f, 5f},
                {6f, 7f, 8f, 9f, 10f},
                {11f, 12f, 13f, 14f, 15f},
                {16f, 17f, 18f, 19f, 20f},
                {21f, 22f, 23f, 24f, 25f}
        };
        Float[][] matrix2 = new Float[][]{
                {1f, 2f, 3f, 4f},
                {5f, 6f, 7f, 8f},
                {9f, 10f, 11f, 12f},
                {13f, 14f, 15f, 16f}
        };
        test(matrix);
        test(matrix2);
    }

    private static void test(Float[][] matrix){
        Float[][] result = Rotate_Image.rotate_Image(matrix);

        System.out.println("Given: " + PrintArrayOrList.arrayMapAsMatrixToString(matrix));
        System.out.println("Result: " + PrintArrayOrList.arrayMapAsMatrixToString(result));
    }
}
