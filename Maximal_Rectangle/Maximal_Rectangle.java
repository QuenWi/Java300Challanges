package Maximal_Rectangle;

public class Maximal_Rectangle {

    //A matrix is filled with 1 and 0. What is the maximum rectangle with 1s?
    public static Integer maximal_Rectangle(Integer[][] matrix){
        Integer result = 0;
        int sizeX, sizeY;
        for(int posY = 0; posY < matrix.length-2; posY++){
            for(int posX = 0; posX < matrix[0].length-2; posX++){
                sizeY = 1;
                while(sizeY+posY < matrix.length && matrix[sizeY+posY][posX] == 1){
                    sizeX = 0;
                    while(sizeX+posX < matrix.length && matrix[posY][sizeX+posX] == 1){
                        if(isRectangle(matrix, posX, posY, sizeX, sizeY)){
                            if((sizeX+1) * (sizeY+1) > result){
                                //System.out.println(String.format("posX = %s, posY = %s, sizeX = %s, sizeY = %s", posX, posY, sizeX+1, sizeY+1));
                                result = (sizeX+1)*(sizeY+1);
                            }
                        }
                        sizeX++;
                    }
                    sizeY++;
                }
            }
        }
        return result;
    }

    private static boolean isRectangle(Integer[][] matrix, int posX, int posY, int sizeX, int sizeY){
        for(int i = 0; i < sizeX; i++){
            if(matrix[posY][i+posX] == 0 || matrix[posY+sizeY][i+posX] == 0){
                return false;
            }
        }
        for(int i = 0; i < sizeY; i++){
            if(matrix[i+posY][posX] == 0 || matrix[i+posY][posX+sizeX] == 0){
                return false;
            }
        }
        return true;
    }
}
