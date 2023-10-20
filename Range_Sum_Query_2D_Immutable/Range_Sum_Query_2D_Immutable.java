package Range_Sum_Query_2D_Immutable;

public class Range_Sum_Query_2D_Immutable {

    //What is the sum from the rectangle? (all edge Numbers)
    public static <T extends Number> T range_Sum_Query_2D_Immutable(T[][] matrix, Integer pos1_x, Integer pos1_y, Integer pos2_x, Integer pos2_y){
        T result = subtraction(matrix[0][0], matrix[0][0]);
        if(pos1_x > pos2_x){
            int step = pos1_x;
            pos1_x = pos2_x;
            pos2_x = step;
        }
        for(int i = pos1_x; i <= pos2_x; i++){
            if(pos1_y != pos2_y){
                result = sum(result, matrix[pos1_y][i]);
                result = sum(result, matrix[pos2_y][i]);
            } else{
                result = sum(result, matrix[pos1_y][i]);
            }
        }
        if(pos1_y > pos2_y){
            int step = pos1_y;
            pos1_y = pos2_y;
            pos2_y = step;
        }
        for(int i = pos1_y+1; i < pos2_y; i++){
            if(pos1_x != pos2_x){
                result = sum(result, matrix[i][pos1_x]);
                result = sum(result, matrix[i][pos2_x]);
            } else {
                result = sum(result, matrix[i][pos1_x]);
            }
        }
        return result;
    }

    private static <T extends Number> T sum(T nr1, T nr2){
        if(nr1 instanceof Float){
            return (T)(Number) (nr1.floatValue() + nr2.floatValue());
        } else if(nr1 instanceof Double){
            return (T)(Number) (nr1.doubleValue() + nr2.doubleValue());
        } else if(nr1 instanceof Integer){
            return (T)(Number) (nr1.intValue() + nr2.intValue());
        } else if(nr1 instanceof Long){
            return (T)(Number) (nr1.longValue() + nr2.longValue());
        } else if(nr1 instanceof Byte){
            return (T)(Number) (nr1.byteValue() + nr2.byteValue());
        } else if(nr1 instanceof Short){
            return (T)(Number) (nr1.shortValue() + nr2.shortValue());
        }
        return null;
    }

    private static <T extends Number> T subtraction(T nr1, T nr2){
        if(nr1 instanceof Float){
            return (T)(Number) (nr1.floatValue() - nr2.floatValue());
        } else if(nr1 instanceof Double){
            return (T)(Number) (nr1.doubleValue() - nr2.doubleValue());
        } else if(nr1 instanceof Integer){
            return (T)(Number) (nr1.intValue() - nr2.intValue());
        } else if(nr1 instanceof Long){
            return (T)(Number) (nr1.longValue() - nr2.longValue());
        } else if(nr1 instanceof Byte){
            return (T)(Number) (nr1.byteValue() - nr2.byteValue());
        } else if(nr1 instanceof Short){
            return (T)(Number) (nr1.shortValue() - nr2.shortValue());
        }
        return null;
    }
}
