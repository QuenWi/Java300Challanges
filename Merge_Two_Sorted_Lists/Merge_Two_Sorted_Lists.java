package Merge_Two_Sorted_Lists;

import java.util.ArrayList;
import java.util.List;

public class Merge_Two_Sorted_Lists {

    //Merge two sorted lists together
    public static <T extends Number> List<T> merge_Two_Sorted_Lists(List<T> list1, List<T> list2){
        List<T> result = new ArrayList<>();
        int i = 0, j = 0;
        while(true){
            if(i < list1.size() && j < list2.size()){
                if(compare(list1.get(i), list2.get(j))){
                    result.add(list1.get(i));
                    i++;
                } else{
                    result.add(list2.get(j));
                    j++;
                }
            } else if(i < list1.size()){
                result.add(list1.get(i));
                i++;
            } else if(j < list2.size()){
                result.add(list2.get(j));
                j++;
            } else{
                break;
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
