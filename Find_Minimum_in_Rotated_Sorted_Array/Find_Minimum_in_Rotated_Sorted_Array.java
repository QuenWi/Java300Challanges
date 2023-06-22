package Find_Minimum_in_Rotated_Sorted_Array;

public class Find_Minimum_in_Rotated_Sorted_Array {

    //Find the minumum rotation of a sorted array.
    public static <T extends Number> Integer find_Minimum_in_Roated_Sorted_Array(T[] array){
        int position = 0;
        T min = array[0];
        for(int i = 1; i < array.length; i++){
            if(compare(array[i], min)){
                position = i;
                min = array[i];
            }
        }
        if(array.length - position+1 > array.length/2){
            return -position;
        } else{
            return array.length-position;
        }
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
