package Find_the_Second_Largest_Number_in_an_Array;

public class Find_the_Second_Largest_Number_in_an_Array {

    public static <T extends Number> T find_the_Second_Largest_Number_in_an_Array(T[] array){
        T first = array[0];
        T second = null;
        if(compare(array[1], first)) {
            second = array[1];
        } else{
            first = array[1];
            second = array[0];
        }
        for(int i = 2; i < array.length; i++){
            if(compare(first, array[i])){
                second  = first;
                first = array[i];
            } else if(compare(second, array[i])){
                second = array[i];
            }
        }
        return second;
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
