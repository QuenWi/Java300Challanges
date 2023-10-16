package Set_Matrix_Zeroes;

public class Set_Matrix_Zeroes {

    //Sets all vertical and horizontal element near a 0 to also 0.
    public static Integer[][] set_Matrix_Zeroes(Integer[][] matrix){
        Integer[][] result = new Integer[matrix.length][matrix[0].length];
        for(int yCoor = 0; yCoor < matrix.length; yCoor++){
            for(int xCoor = 0; xCoor < matrix[0].length; xCoor++){
                if(matrix[yCoor][xCoor] == 0){
                    setHorizontal(result, yCoor);
                    setVertical(result, xCoor);
                } else{
                    if(result[yCoor][xCoor] == null){
                        result[yCoor][xCoor] = 1;
                    }
                }
            }
        }
        return result;
    }

    private static void setHorizontal(Integer[][] result, int y){
        for(int xCoor = 0; xCoor < result[0].length; xCoor++){
            result[y][xCoor] = 0;
        }
    }

    private static void setVertical(Integer[][] result, int x){
        for(int yCoor = 0; yCoor < result.length; yCoor++){
            result[yCoor][x] = 0;
        }
    }
}
