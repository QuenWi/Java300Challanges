package Surrounded_Regions;

public class Surrounded_Regions {

    //Remove all islands in the matrix. An island is an O or group of Os, surround by X
    public static Character[][] surrounded_Regions(Character[][] matrix){
        Character[][] result = new Character[matrix.length][matrix[0].length];
        for(int x = 0; x < matrix[0].length; x++){
            if(matrix[0][x] == 'O'){
                noteLand(matrix, result, x, 0);
            }
            if(matrix[matrix.length-1][x] == 'O'){
                noteLand(matrix, result, x, matrix.length-1);
            }
        }
        for(int y = 1; y < matrix.length-1; y++){
            if(matrix[y][0] == 'O'){
                noteLand(matrix, result, 0, y);
            }
            if(matrix[y][matrix[0].length-1] == 'O'){
                noteLand(matrix, result, matrix[0].length-1, y);
            }
        }
        for(int x = 0; x < matrix[0].length; x++){
            for(int y = 0; y < matrix.length; y++){
                if(result[y][x] == null){
                    result[y][x] = 'X';
                }
            }
        }
        return result;
    }

    private static void noteLand(Character[][] matrix, Character[][] result, int x, int y){
        result[y][x] = 'O';
        if(x-1 > -1){
            if(result[y][x-1] == null && matrix[y][x-1] == 'O'){
                noteLand(matrix, result, x-1, y);
            }
        }
        if(x+1 < matrix[0].length){
            if(result[y][x+1] == null && matrix[y][x+1] == 'O'){
                noteLand(matrix, result, x+1, y);
            }
        }
        if(y-1 > -1){
            if(result[y-1][x] == null && matrix[y-1][x] == 'O'){
                noteLand(matrix, result, x, y-1);
            }
        }
        if(y+1 < matrix.length){
            if(result[y+1][x] == null && matrix[y+1][x] == 'O'){
                noteLand(matrix, result, x, y+1);
            }
        }
    }
}
