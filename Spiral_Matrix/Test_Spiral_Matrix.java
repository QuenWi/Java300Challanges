package Spiral_Matrix;

import Helpers.PrintArrayOrList;

public class Test_Spiral_Matrix {

    public static void main(String[] args) {
        Character[][] matrix = new Character[][]{
                {'a', 'b', 'c', 'd', 'e'},
                {'f', 'g', 'h', 'i', 'j'},
                {'k', 'l', 'm', 'n', 'o'},
                {'p', 'q', 'r', 's', 't'}
        };
        Character[][] matrix2 = new Character[][]{
                {'a', 'b', 'c', 'd', 'e'},
                {'f', 'g', 'h', 'i', 'j'},
                {'k', 'l', 'm', 'n', 'o'},
                {'p', 'q', 'r', 's', 't'},
                {'u', 'v', 'w', 'x', 'y'}
        };
        Character[][] matrix3 = new Character[][]{
                {'a', 'b', 'c', 'd'},
                {'e', 'f', 'g', 'h'},
                {'i', 'j', 'k', 'l'},
                {'m', 'n', 'o', 'p'}
        };
        test(matrix);
        test(matrix2);
        test(matrix3);
    }

    private static void test(Character[][] matrix){
        Character[] result = Spiral_Matrix.spiral_Matrix(matrix);

        System.out.println("Given: " + PrintArrayOrList.arrayMapAsMatrixToString(matrix));
        System.out.println("Result: " + PrintArrayOrList.arrayToString(result));
    }
}
