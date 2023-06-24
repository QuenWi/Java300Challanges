package Longest_Increasing_Subsequence;

import Helpers.PrintArrayOrList;

public class Longest_Increasing_Subsequence {

    //return the longest increasing subsquence inside an unsorted array. The sequence has not to be continues.
    //Example {1, 4, 2, 3} The longest subsequence would be {1, 2, 3}
    public static <T extends Number> Integer longest_Increasing_Subsequence(T[] array){
        Integer[] max = new Integer[array.length];
        max[0] = 1;
        Integer result = 1;
        Integer memory = 0;
        for(int i = 1; i < array.length; i++){
            memory = 1;
            for(int j = 0; j < i; j++){
                if(compare(array[j], array[i])){
                    if(compare(memory, max[j])){
                        memory = max[j] + 1;
                    } else if(memory.equals(max[j])){
                        memory++;
                    }
                }
            }
            max[i] = memory;
            if(compare(result, memory)){
                result = memory;
            }
        }
        //System.out.println(PrintArrayOrList.arrayToString(max)); //Can be usefull
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
