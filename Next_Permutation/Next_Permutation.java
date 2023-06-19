package Next_Permutation;

import Helpers.PrintArrayOrList;

import java.io.PrintStream;

public class Next_Permutation {

    //Gets the next Permutation
    public static <T extends Number> void next_Permutation(T[] array){
        int number = -1;
        T memory;
        for(int i = array.length-2; i >= 0; i--){
            if(compare(array[i], array[i+1])){
                number = i;
                break;
            }
        }
        if(number == -1){
            for (int i = 0; i < array.length/2; i++){
                memory = array[i];
                array[i] = array[array.length-1-i];
                array[array.length-1] = memory;
            }
        } else{
            for (int i = 0; i < array.length; i++){
                if(compare(array[number], array[i])){
                    memory = array[number];
                    array[number] = array[i];
                    array[i] = memory;
                    break;
                }
            }
            for (int i = number+1; i < (array.length+number+1)/2; i++){
                memory = array[i];
                array[i] = array[array.length-i+number];
                array[array.length-i+number] = memory;
            }
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
