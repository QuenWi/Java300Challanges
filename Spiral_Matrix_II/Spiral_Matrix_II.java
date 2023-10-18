package Spiral_Matrix_II;

public class Spiral_Matrix_II {

    //returns a spiral matrix with n^2 element, where each element in spiral order goes one up.
    public static Integer[][] spiral_Matrix_II(Integer integer)
    {
        Integer[][] result = new Integer[integer][integer];
        int top = 0, bottom = integer-1, left = 0, right = integer-1;
        int direction = 1, counter = 1;
        while(top <= bottom && left <= right){
            if(direction == 1){
                for(int i = left; i <= right; i++){
                    result[top][i] = counter;
                    counter++;
                }
                top++;
                direction = 2;
            } else if(direction == 2){
                for(int i = top; i <= bottom; i++){
                    result[i][right] = counter;
                    counter++;
                }
                right--;
                direction = 3;
            } else if(direction == 3){
                for(int i = right; i >= left; i--){
                    result[bottom][i] = counter;
                    counter++;
                }
                bottom--;
                direction = 4;
            } else{
                for(int i = bottom; i >= top; i--){
                    result[i][left] = counter;
                    counter++;
                }
                left++;
                direction = 1;
            }
        }

        return result;
    }
}
