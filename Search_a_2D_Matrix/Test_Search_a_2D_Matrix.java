package Search_a_2D_Matrix;

import Helpers.PrintArrayOrList;

public class Test_Search_a_2D_Matrix {
    public static void main(String[] args) {
        test(new Double[][]{
                {1d, 3d, 5d, 6d, 7d},
                {8d, 10d, 12d, 13d},
                {14d, 16d, 18d, 19d, 20d, 21d},
                {22d, 24d},
                {25d, 26d, 27.7d, 29d},
                {30d, 31d, 32d, 33d}
        }, 20d);
        test(new Double[][]{
                {1d, 3d, 5d, 6d, 7d},
                {8d, 10d, 12d, 13d},
                {14d, 16d, 18d, 19d, 20d, 21d},
                {22d, 24d},
                {25d, 26d, 27d, 29d},
                {30d, 31d, 32d, 33d}
        }, 24d);
        test(new Double[][]{
                {1d, 3d, 5d, 6d, 7d},
                {8d, 10d, 12d, 13d},
                {14d, 16d, 18d, 19d, 20d, 21d},
                {22d, 24d},
                {25d, 26d, 27d, 29d},
                {30d, 31d, 32d, 33d}
        }, 4d);
        test(new Double[][]{
                {1d, 3d, 5d, 6d, 7d},
                {8d, 10d, 12d, 13d},
                {14d, 16d, 18d, 19d, 20d, 21d},
                {22d, 24d},
                {25d, 26d, 27d, 29d},
                {30d, 31d, 32d, 33d}
        }, 33d);
        test(new Double[][]{
                {1d, 3d, 5d, 6d, 7d},
                {8d, 10d, 12d, 13d},
                {14d, 16d, 18d, 19d, 20d, 21d},
                {22d, 24d},
                {25d, 26d, 27d, 29d},
                {30d, 31d, 32d, 33d}
        }, 0d);
        test(new Double[][]{
                {1d, 3d, 5d, 6d, 7d},
                {8d, 10d, 12d, 13d},
                {14d, 16d, 18d, 19d, 20d, 21d},
                {22d, 24d},
                {25d, 26d, 27d, 29d},
                {30d, 31d, 32d, 33d}
        }, 34d);
    }

    private static void test(Double[][] matrix, Double wanted){
        Boolean result = Search_a_2D_Matrix.search_a_2D_Matrix(matrix, wanted);

        System.out.println("Given: " + wanted.toString() + " and " + PrintArrayOrList.arrayMatrixToString(matrix));
        System.out.println("Result: " + result.toString());
    }
}
