package Wiggle_Sort;

public class Wiggle_Sort {

    //Makes a wiggle sort: n1 < n2 > n3 < n4 > n5 < n6 ...
    public static <T extends Number> void wiggle_Sort(T[] array){
        boolean tickTack = true; //wiggle wiggle
        T memory;
        for(int i = 1; i < array.length; i++){
            if(tickTack){ //n1 < n2
                if(!(compare(array[i-1], array[i]))){
                    memory = array[i-1];
                    array[i-1] = array[i];
                    array[i] = memory;
                }
            } else{ //n2 > n3
                if(!(compare(array[i], array[i-1]))){
                    memory = array[i-1];
                    array[i-1] = array[i];
                    array[i] = memory;
                }
            }
            tickTack = !tickTack;
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
