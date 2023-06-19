package Search_Insert_Position;

public class Search_Insert_Position {

    //What is the position of an Element in a sorted Array, or where would it be if it is not in there.
    public static <T extends Number> Integer search_Intert_Position(T[] array, T element){
        int result = array.length/2;
        int memory = 0;
        int i = 4;
        while(result != memory){
            if(element.equals(array[result])){
                return result;
            } else if(compare(element, array[result])){
                memory = result;
                result += array.length/i;
            } else {
                memory = result;
                result -= array.length/i;
            }
            i *= i;
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
