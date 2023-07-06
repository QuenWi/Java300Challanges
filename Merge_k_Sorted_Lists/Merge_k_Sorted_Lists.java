package Merge_k_Sorted_Lists;

import java.util.ArrayList;
import java.util.List;

public class Merge_k_Sorted_Lists {

    //Merge all sorted Lists together.
    public static <T extends Number> List<T> merge_k_Sorted_Lists(List<List<T>> lists){
        List<T> result = new ArrayList<>();
        int[] counters = new int[lists.size()];
        for(int i = 0; i < counters.length; i++){
            counters[i] = 0;
        }
        T min;
        while(true){
            min = null;
            for(int i = 0; i < lists.size(); i++){
                if(!(counters[i] >= lists.get(i).size())){
                    if(min == null){
                        min = lists.get(i).get(counters[i]);
                    } else if(compare(lists.get(i).get(counters[i]), min)){
                        min = lists.get(i).get(counters[i]);
                    }
                }
            }
            if(min == null){
                break;
            }
            result.add(min);
            for(int i = 0; i < lists.size(); i++){
                if(!(counters[i] >= lists.get(i).size())){
                    if(min.equals(lists.get(i).get(counters[i]))){
                        counters[i]++;
                    }
                }
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
