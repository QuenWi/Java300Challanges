package Search_a_2D_Matrix_II;

public class Search_a_2D_Matrix_II {

    //Shows if in a Matrix is an Element. The matrix is sorted in the following way:
    //The elements are sorted inside a row and inside a coloum.
    public static <T extends Number> Boolean search_a_2D_Matrix_II(T[][] matrix, T wanted){
        int x = matrix[0].length-1;
        int y = 0;
        while(true){
            if(wanted.equals(matrix[y][x])){
                return true;
            }
            if(compare(matrix[y][x], wanted)){
                if(x == matrix[0].length-1){
                    y++;
                } else if(compare(wanted, matrix[y][x+1])){
                    y++;
                } else{
                    x++;
                }
                if(y >= matrix.length){
                    break;
                }
            } else{
                x--;
                if(x < 0){
                    break;
                }
            }
        }
        return false;
    }

    Float[][] matrix = new Float[][]{
            {1f, 4f, 7f, 11f, 15f},
            {2f, 5f, 8f, 12f, 19f},
            {3f, 6f, 9f, 16f, 22f},
            {10f, 13f, 14f, 17f, 24f},
            {18f, 21f, 23f, 26f, 30f}
    };

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
