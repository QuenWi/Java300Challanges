package Spiral_Matrix;

import java.lang.reflect.Array;

public class Spiral_Matrix {

    //Give all elements of an matrix as an Array back in spiral order
    public static <T> T[] spiral_Matrix(T[][] matrix){
        T[] result = (T[]) (Array.newInstance(matrix[0].getClass().getComponentType(), matrix.length * matrix[0].length));
        int counter = 0;
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        int direction = 1; //1 right, 2 down, 3 left, 4 up
        while(top <= bottom && left <= right){
            if(direction == 1){
                for(int i = left; i <= right; i++){
                    result[counter] = matrix[top][i];
                    counter++;
                }
                top++;
                direction = 2;
            } else if(direction == 2){
                for(int i = top; i <= bottom; i++){
                    result[counter] = matrix[i][right];
                    counter++;
                }
                right--;
                direction = 3;
            } else if(direction == 3){
                for(int i = right; i >= left; i--){
                    result[counter] = matrix[bottom][i];
                    counter++;
                }
                bottom--;
                direction = 4;
            } else {
                for(int i = bottom; i >= top; i--){
                    result[counter] = matrix[i][left];
                    counter++;
                }
                left++;
                direction = 1;
            }
        }
        return result;
    }
}
