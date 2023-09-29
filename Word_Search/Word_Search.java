package Word_Search;

import java.util.ArrayList;
import java.util.List;

public class Word_Search {

    //You can move up, down, right and left, is the Word inside the Matrix?
    public static Boolean word_Search(Character[][] matrix, String string){
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j].equals(string.charAt(0))) {
                    int maxLength = recursive(matrix, string, 1, j, i);
                    if (maxLength == string.length()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static int recursive(Character[][] matrix, String string, int step, int xCoordinate, int yCoordinate){
        if(step == string.length()){
            return step;
        }
        List<Integer> list = new ArrayList<>();
        list.add(step);
        int result = 0;
        if(xCoordinate+1 < matrix[0].length){
            if(matrix[yCoordinate][xCoordinate+1].equals(string.charAt(step))){
                list.add(recursive(matrix, string, step+1, xCoordinate+1, yCoordinate));
            }
        }
        if(xCoordinate-1 > -1){
            if(matrix[yCoordinate][xCoordinate-1].equals(string.charAt(step))){
                list.add(recursive(matrix, string, step+1, xCoordinate-1, yCoordinate));
            }
        }
        if(yCoordinate+1 < matrix.length){
            if(matrix[yCoordinate+1][xCoordinate].equals(string.charAt(step))){
                list.add(recursive(matrix, string, step+1, xCoordinate, yCoordinate+1));
            }
        }
        if(yCoordinate-1 > -1){
            if(matrix[yCoordinate-1][xCoordinate].equals(string.charAt(step))){
                list.add(recursive(matrix, string, step+1, xCoordinate, yCoordinate-1));
            }
        }
        for(Integer i : list){
            if(i > result){
                result = i;
            }
        }
        return result;
    }
}
