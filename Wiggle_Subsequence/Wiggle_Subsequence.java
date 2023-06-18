package Wiggle_Subsequence;

public class Wiggle_Subsequence {

    //How long is the longest wiggle subsequence?
    public static <T extends Number> Integer wiggle_Subsequence(T[] array){
        Integer result = 1;
        Integer memory = 1;
        int ticktack = 0; //1: <, -1: >

        for (int i = 1; i < array.length; i++){
            if(array[i].equals(array[i-1])){
                memory = 1;
                ticktack = 0;
            }
            else if(ticktack == 0){
                if (compare(array[i-1], array[i])) {
                    ticktack = 1;
                } else{
                    ticktack = -1;
                }
                memory++;
            }
            else if(ticktack == 1){
                if (compare(array[i], array[i-1])) {
                    ticktack = -1;
                    memory++;
                } else{
                    ticktack = 0;
                    memory = 1;
                }
            }
            else if(ticktack == -1){
                if (compare(array[i-1], array[i])) {
                    ticktack = 1;
                    memory++;
                } else{
                    ticktack = 0;
                    memory = 1;
                }
            }
            if(memory.intValue() > result.intValue()){
                result = memory;
            }
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
