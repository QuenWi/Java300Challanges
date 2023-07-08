package Max_Sum_of_Rectangle_No_Larger_Than_K;

public class Max_Sum_of_Rectangle_No_Larger_Than_K {

    //Which combination of 4 numbers is the closest/under the wanted sum. It returns their sum.
    public static <T extends Number> T max_Sum_of_Rectangle_No_Larger_Than_K(T[][] matrix, T wanted){
        T result = (T) (Number) 0;
        T memory;
        for(int i = 0; i < matrix.length-1; i++){
            for(int j = i+1; j < matrix.length; j++){ //Goes through all coloums
                for(int k = 0; k < matrix[i].length-1; k++){
                    for(int l = k+1; l < matrix[i].length; l++){ //Goes through all combination of 2 numbers
                        memory = sum(matrix[i][k], matrix[i][l]);
                        memory = sum(memory, matrix[j][k]);
                        memory = sum(memory, matrix[j][l]);
                        if(memory.equals(wanted)){
                            /*System.out.println(String.format("i: %s, j: %s, k: %s, l: %s", i, j, k, l));
                            System.out.println(String.format("1: %s, 2: %s, 3: %s, 4: %s",
                                    matrix[i][k], matrix[i][l], matrix[j][k], matrix[j][l]));*/
                            return wanted;
                        } else if(compare(result, memory) && compare(memory, wanted)){
                            result = memory;
                        }
                    }
                }
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
