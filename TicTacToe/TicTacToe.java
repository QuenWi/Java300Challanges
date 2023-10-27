package TicTacToe;

import Helpers.PrintArrayOrList;

public class TicTacToe {

    private int player = 1;

    private Integer[][] field = new Integer[][]{
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
    };

    public String insert(int x, int y){
        field[y][x] = player;
        if(player == 1){
            player = 2;
        } else{
            player = 1;
        }
        String result = "";
        if(won()){
            result = PrintArrayOrList.arrayMapAsMatrixToString(field) + "Game is won!";
        } else{
            if(fullField()){
                result = PrintArrayOrList.arrayMapAsMatrixToString(field) + "Game over, game will reset!";
                field = new Integer[][]{
                        {0, 0, 0},
                        {0, 0, 0},
                        {0, 0, 0}
                };
            } else {
                result = "Game is still on!";
            }
        }
        return result;
    }

    private boolean won(){
        if(field[0][0] != 0){
            if(field[0][0] == field[1][0] && field[0][0] == field[2][0]){
                return true;
            }
            if(field[0][0] == field[0][1] && field[0][0] == field[0][2]){
                return true;
            }
        }
        if(field[1][1] != 0){
            if(field[1][1] == field[1][0] && field[1][1] == field[1][2]){
                return true;
            }
            if(field[1][1] == field[0][1] && field[1][1] == field[2][1]){
                return true;
            }
            if(field[1][1] == field[0][0] && field[1][1] == field[2][2]){
                return true;
            }
            if(field[1][1] == field[0][2] && field[1][1] == field[2][0]){
                return true;
            }
        }
        if(field[2][2] != 0){
            if(field[2][2] == field[1][2] && field[2][2] == field[0][2]){
                return true;
            }
            if(field[2][2] == field[2][1] && field[2][2] == field[2][0]){
                return true;
            }
        }
        return false;
    }

    private boolean fullField(){
        if(field[0][0] != 0 && field[0][1] != 0 && field[0][2] != 0 &&
                field[1][0] != 0 && field[1][1] != 0 && field[1][2] != 0 &&
                field[2][0] != 0 && field[2][1] != 0 && field[2][2] != 0){
            return true;
        } else{
            return false;
        }
    }
}
