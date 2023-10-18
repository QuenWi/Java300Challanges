package Rotate_Image;

import Helpers.PrintArrayOrList;

import java.lang.reflect.Array;

public class Rotate_Image {

    //rotate a n^2 matrix clockwise
    public static <T> T[][] rotate_Image(T[][] matrix){
        T[][] result = (T[][]) Array.newInstance(matrix[0][0].getClass(), matrix.length, matrix.length);
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                result[i][j] = matrix[i][j];
            }
        }
        for(int i = 1; i < matrix.length; i++){
            for(int j = 0; j < i; j++){
                T step = matrix[j][i];
                result[j][i] = result[i][j];
                result[i][j] = step;
            }
        }
        return result;
    }
}
