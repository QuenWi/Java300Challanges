package Best_Meeting_Point;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Best_Meeting_Point {

    //What is the maximum distance, everyone together has to travel. (mahatten distance)
    public static Integer best_Meeting_Point(Integer[][] matrix){
        Integer result = 0;
        List<Integer> xValues = new ArrayList<>();
        List<Integer> yValues = new ArrayList<>();
        for(int yKoor = 0; yKoor < matrix.length; yKoor++){
            for(int xKoor = 0; xKoor < matrix[0].length; xKoor++){
                if(matrix[yKoor][xKoor] == 1){
                    xValues.add(xKoor);
                    yValues.add(yKoor);
                }
            }
        }
        xValues.sort(new Comparator<Integer>() {
            @Override public int compare(Integer o1, Integer o2) {return Integer.compare(o1, o2);}
        });
        yValues.sort(new Comparator<Integer>() {
            @Override public int compare(Integer o1, Integer o2) {return Integer.compare(o1, o2);}
        });
        int xmedian = -1;
        int ymedian = -1;
        if(xValues.size() % 2 == 0){
            xmedian = (xValues.get(xValues.size()/2) + xValues.get(xValues.size()/2-1))/2;
        } else{
            xmedian = (xValues.get(xValues.size()/2));
        }
        if(yValues.size() % 2 == 0){
            ymedian = (yValues.get(yValues.size()/2) + yValues.get(yValues.size()/2-1))/2;
        } else{
            ymedian = (yValues.get(yValues.size()/2));
        }
        result = allDistances(matrix, xmedian, ymedian);
        if(result > allDistances(matrix, xmedian+1, ymedian+1)){
            result = allDistances(matrix, xmedian+1, ymedian+1);
        }
        if(result > allDistances(matrix, xmedian, ymedian+1)){
            result = allDistances(matrix, xmedian, ymedian+1);
        }
        if(result > allDistances(matrix, xmedian+1, ymedian)){
            result = allDistances(matrix, xmedian+1, ymedian);
        }
        return result;
    }

    private static int allDistances(Integer[][] matrix, int x, int y){
        int result = 0;
        for(int yKoor = 0; yKoor < matrix.length; yKoor++){
            for(int xKoor = 0; xKoor < matrix[0].length; xKoor++){
                if(matrix[yKoor][xKoor] == 1){
                    result += Math.abs(yKoor-y) + Math.abs(xKoor-x);
                }
            }
        }
        return result;
    }
}
