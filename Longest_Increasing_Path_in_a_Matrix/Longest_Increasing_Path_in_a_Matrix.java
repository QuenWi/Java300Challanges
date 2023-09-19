package Longest_Increasing_Path_in_a_Matrix;

public class Longest_Increasing_Path_in_a_Matrix {

    static int[][] paths;

    //how long is the longest path you can go inside a matrix?
    public static <T extends Number> Integer longest_Increasing_Path_in_a_Matrix(T[][] matrix){
        paths = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(paths[i][j] == 0){
                    int lenght = 1;
                    int memory = -1;
                    if(i + 1 < matrix.length && compare(matrix[i][j], matrix[i+1][j])){
                        memory = checkNeighbors(matrix, i+1, j);
                    }
                    if(lenght < memory+1){
                        lenght = memory+1;
                    }
                    if(i - 1 > -1 && compare(matrix[i][j], matrix[i-1][j])){
                        memory = checkNeighbors(matrix, i-1, j);
                    }
                    if(lenght < memory+1){
                        lenght = memory+1;
                    }
                    if(j+1 < matrix[0].length && compare(matrix[i][j], matrix[i][j+1])){
                        memory = checkNeighbors(matrix, i, j+1);
                    }
                    if(lenght < memory+1){
                        lenght = memory+1;
                    }
                    if(j-1 > -1 && compare(matrix[i][j], matrix[i][j-1])){
                        memory = checkNeighbors(matrix, i, j-1);
                    }
                    if(lenght < memory+1){
                        lenght = memory+1;
                    }
                    paths[i][j] = lenght;
                }
            }
        }

        int result = 0;
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(result < paths[i][j]){
                    result = paths[i][j];
                }
            }
        }
        return result;
    }

    private static <T extends Number> int checkNeighbors(T[][] matrix, int i, int j){
        if(paths[i][j] != 0){
            return paths[i][j];
        } else{
            int lenght = 1;
            int memory = -1;
            if(i + 1 < matrix.length && compare(matrix[i][j], matrix[i+1][j])){
                memory = checkNeighbors(matrix, i+1, j);
            }
            if(lenght < memory+1){
                lenght = memory+1;
            }
            if(i - 1 > -1 && compare(matrix[i][j], matrix[i-1][j])){
                memory = checkNeighbors(matrix, i-1, j);
            }
            if(lenght < memory+1){
                lenght = memory+1;
            }
            if(j+1 < matrix[0].length && compare(matrix[i][j], matrix[i][j+1])){
                memory = checkNeighbors(matrix, i, j+1);
            }
            if(lenght < memory+1){
                lenght = memory+1;
            }
            if(j-1 > -1 && compare(matrix[i][j], matrix[i][j-1])){
                memory = checkNeighbors(matrix, i, j-1);
            }
            if(lenght < memory+1){
                lenght = memory+1;
            }
            paths[i][j] = lenght;
            return lenght;
        }
    }

    public static <T extends Number> boolean compare(T nr1, T nr2){
        boolean result = false;
        if(nr1 instanceof Float){
            if(nr1.floatValue() < nr2.floatValue()){
                return true;
            } else{
                return false;
            }
        } else if(nr1 instanceof Double){
            if(nr1.doubleValue() < nr2.doubleValue()){
                return true;
            } else{
                return false;
            }
        } else if(nr1 instanceof Integer){
            if(nr1.intValue() < nr2.intValue()){
                return true;
            } else{
                return false;
            }
        } else if(nr1 instanceof Short){
            if(nr1.longValue() < nr2.longValue()){
                return true;
            } else{
                return false;
            }
        } else if(nr1 instanceof Byte){
            if(nr1.byteValue() < nr2.byteValue()){
                return true;
            } else{
                return false;
            }
        } else if(nr1 instanceof Short){
            if(nr1.shortValue() < nr2.shortValue()){
                return true;
            } else{
                return false;
            }
        }
        return result;
    }
}
