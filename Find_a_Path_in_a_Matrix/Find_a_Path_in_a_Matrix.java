package Find_a_Path_in_a_Matrix;

import Helpers.PrintArrayOrList;

public class Find_a_Path_in_a_Matrix {

    //returns the path from a binary labyrinth. Start up left, end bottom right
    public static Integer[][] find_a_Path_in_a_Matrix(Integer[][] matrix){
        Integer[][] result = new Integer[matrix.length][matrix[0].length];
        for(int y = 0; y < matrix.length; y++){
            for(int x = 0; x < matrix[0].length; x++){
                result[y][x] = 0;
            }
        }
        if(matrix[0][0] == 0 || matrix[matrix.length-1][matrix[0].length-1] == 0){
            return result;
        } else{
            boolean foundEnd = watchNeighbors(matrix, result, 0, 0);
            if(foundEnd){
                result[0][0] = 1;
            }
        }
        for(int y = 0; y < matrix.length; y++){
            for(int x = 0; x < matrix[0].length; x++) {
                if (result[y][x] == 2) {
                    result[y][x] = 0;
                }
            }
        }
        return result;
    }

    private static boolean watchNeighbors(Integer[][] matrix, Integer[][] result, int xCoor, int yCoor){
        result[yCoor][xCoor] = 2;
        if(xCoor+1 == matrix[0].length && yCoor+1 == matrix.length){
            result[yCoor][xCoor] = 1;
            return true;
        }
        if(matrix[0].length > xCoor+1){
            if(matrix[yCoor][xCoor+1] == 1 && result[yCoor][xCoor+1] != 2){
                if(watchNeighbors(matrix, result,xCoor+1, yCoor) == true){
                    result[yCoor][xCoor] = 1;
                    return true;
                }
            }
        }
        if(matrix.length > yCoor+1){
            if(matrix[yCoor+1][xCoor] == 1 && result[yCoor+1][xCoor] != 2){
                if(watchNeighbors(matrix, result, xCoor, yCoor+1) == true){
                    result[yCoor][xCoor] = 1;
                    return true;
                }
            }
        }
        if(-1 < xCoor-1){
            if(matrix[yCoor][xCoor-1] == 1 && result[yCoor][xCoor-1] != 2){
                if(watchNeighbors(matrix, result,xCoor-1, yCoor) == true){
                    result[yCoor][xCoor] = 1;
                    return true;
                }
            }
        }
        if(-1 < yCoor-1){
            if(matrix[yCoor-1][xCoor] == 1 && result[yCoor-1][xCoor] != 2){
                if(watchNeighbors(matrix, result, xCoor, yCoor-1) == true){
                    result[yCoor][xCoor] = 1;
                    return true;
                }
            }
        }
        return false;
    }
}
