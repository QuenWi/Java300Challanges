package Increasing_Triplet_Subsequence;

public class Increasing_Triplet_Subsequence {

    //Is there a continues substring, where the 3 numbers increase?
    public static <T extends Number> Boolean increasing_Triplet_Subsequence(T[] array){
        int count = 1;
        for(int i = 1; i < array.length; i++){
            if(compare(array[i-1], array[i])){
                count++;
                if(count == 3){
                    return true;
                }
            } else{
                count = 1;
            }
        }
        return false;
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
