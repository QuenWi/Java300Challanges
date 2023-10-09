package Surrounded_Regions;

import Helpers.PrintArrayOrList;

public class Test_Surrounded_Regions {

    public static void main(String[] args) {
        Character[][] matrix = new Character[][]{
                {'O', 'X', 'O', 'X', 'X', 'X', 'O', 'X'},
                {'X', 'X', 'O', 'X', 'X', 'O', 'O', 'X'},
                {'X', 'X', 'X', 'X', 'O', 'X', 'O', 'O'},
                {'X', 'O', 'X', 'O', 'X', 'X', 'X', 'X'},
                {'O', 'X', 'O', 'O', 'X', 'O', 'O', 'O'},
                {'X', 'X', 'O', 'X', 'O', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X', 'X', 'O', 'X', 'O'},
        };
        test(matrix);
    }

    private static void test(Character[][] matrix){
        Character[][] result = Surrounded_Regions.surrounded_Regions(matrix);

        System.out.println("Given: " + PrintArrayOrList.arrayMapAsMatrixToString(matrix));
        System.out.println("Result: " + PrintArrayOrList.arrayMapAsMatrixToString(result));
    }
}
