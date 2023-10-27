package Game_of_Life;

public class Game_of_Life {

    //Game of life, one step
    public static Integer[][] game_of_Life(Integer[][] matrix){
        Integer[][] result = new Integer[matrix.length][matrix[0].length];
        for(int yKoor = 0; yKoor < matrix.length; yKoor++){
            for (int xKoor = 0; xKoor < matrix[0].length; xKoor++){
                checkCell(matrix, result, xKoor, yKoor);
            }
        }
        return result;
    }

    private static void checkCell(Integer[][] matrix, Integer[][] result, int x, int y){
        int neighbors = 0;
        if(y+1 < matrix.length){
            if(matrix[y+1][x] == 1){
                neighbors++;
            }
            if(x+1 < matrix[0].length){
                if(matrix[y+1][x+1] == 1){
                    neighbors++;
                }
            }
            if(x-1 > 0){
                if(matrix[y+1][x-1] == 1){
                    neighbors++;
                }
            }
        }
        if(y-1 > 0){
            if(matrix[y-1][x] == 1){
                neighbors++;
            }
            if(x+1 < matrix[0].length){
                if(matrix[y-1][x+1] == 1){
                    neighbors++;
                }
            }
            if(x-1 > 0){
                if(matrix[y-1][x-1] == 1){
                    neighbors++;
                }
            }
        }
        if(x+1 < matrix[0].length){
            if(matrix[y][x+1] == 1){
                neighbors++;
            }
        }
        if(x-1 > 0){
            if(matrix[y][x-1] == 1){
                neighbors++;
            }
        }
        if(matrix[y][x] == 1){
            if(neighbors == 2 || neighbors == 3){
                result[y][x] = 1;
            } else{
                result[y][x] = 0;
            }
        } else{
            if(neighbors == 3){
                result[y][x] = 1;
            } else{
                result[y][x] = 0;
            }
        }
    }
}
