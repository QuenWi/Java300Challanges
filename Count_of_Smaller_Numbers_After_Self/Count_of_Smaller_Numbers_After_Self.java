package Count_of_Smaller_Numbers_After_Self;

import java.lang.reflect.Array;

public class Count_of_Smaller_Numbers_After_Self {

    //Shows how many elements to the right are smaller from each element in an array
    public static <T extends Number> Integer[] count_of_Smaller_Numbers_After_Self(T[] array){
        Integer[] result = new Integer[array.length];
        result[array.length-1] = 0;
        Integer memory;
        for(int i = array.length-2; i >= 0; i--){
            memory = 0;
            for(int j = i+1; j < array.length; j++){
                if(compare(array[j], array[i])){
                    memory++;
                }
            }
            result[i] = memory;
        }

        return result;
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
