package Merge_K_Sorted_Arrays_in_Java;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Merge_K_Sorted_Arrays_in_Java {

    //Merge Arrays together
    public static <T extends Number> T[] merge_K_Sorted_Arrays_in_Java(T[][] array){
        T[] result;
        int[] counters = new int[array.length];
        for(int i = 0; i < counters.length; i++){
            counters[i] = 0;
        }
        ArrayList<T> list = new ArrayList<>();
        T min;
        while(true){
            min = null;
            for(int i = 0; i < array.length; i++){
                if(!(counters[i] >= array[i].length)){
                    if(min == null){
                        min = array[i][counters[i]];
                    } else if(compare(array[i][counters[i]], min)){
                        min = array[i][counters[i]];
                    }
                }
            }
            if(min == null){
                break;
            }
            list.add(min);
            for(int i = 0; i < array.length; i++){
                if(!(counters[i] >= array[i].length)){
                    if(min.equals(array[i][counters[i]])){
                        counters[i]++;
                    }
                }
            }
        }
        result = (T[])Array.newInstance(array[0].getClass().getComponentType(), list.size());
        result = list.toArray(result);
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
