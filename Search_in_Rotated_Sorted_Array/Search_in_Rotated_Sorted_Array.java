package Search_in_Rotated_Sorted_Array;

import Helpers.Interval;

public class Search_in_Rotated_Sorted_Array {

    //Searches in rotated sorted array with duplicates if it includes an item.
    public static <T extends Number> Interval<Integer> search_in_Rotated_Sorted_Array(T[] array, T element) {
        int min = 0;
        int max = array.length-1;
        int index = 0;
        int memory = -1;
        while (min != max) {
            index = (max + min) / 2;
            if (element.equals(array[index])) {
                memory = index;
                break;
            }
            if (compare(element, array[index])) {
                if (compare(element, array[min])) {
                    if (min == index) {
                        min++;
                    } else {
                        min = index;
                    }
                } else {
                    max = index;
                }
            } else {
                if (compare(array[max], element)) {
                    max = index;
                } else {
                    if (min == index) {
                        min++;
                    } else {
                        min = index;
                    }
                }
            }
        }
        if (memory == -1 && element.equals(array[index])) {
            memory = index;
        }
        if (memory == -1) {
            return new Interval<Integer>(-1, -1);
        }
        min = memory;
        max = memory;
        while(min > 0 && array[min-1].equals(element)){
            min--;
        }
        while(max < array.length-1 && array[max+1].equals(element)){
            max++;
        }
        return new Interval<Integer>(min, max);
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
