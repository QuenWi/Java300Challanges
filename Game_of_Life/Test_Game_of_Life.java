package Game_of_Life;

import Helpers.PrintArrayOrList;

public class Test_Game_of_Life {

    public static void main(String[] args) {
        Integer[][] matrix = new Integer[][]{
                {0, 0, 0, 0, 0, 1},
                {0, 1, 1, 1, 0, 0},
                {0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1}
        };
        test(matrix);
    }

    private static void test(Integer[][] matrix){
        Integer[][] result = Game_of_Life.game_of_Life(matrix);

        System.out.println("Given: " + PrintArrayOrList.arrayMapAsMatrixToString(matrix));
        System.out.println("Result: " + PrintArrayOrList.arrayMapAsMatrixToString(result));
    }
}
