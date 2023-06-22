package Find_First_and_Last_Position_of_Element_in_Sorted_Array;

import Helpers.Interval;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {

    //It returns for a sorted array with duplicates the first and last position of an element init.
    public static <T extends Number> Interval<Integer> find_First_and_Last_Position_of_Element_in_Sorted_Array
    (T[] array, T element){
        int pos = -1;

        int bottom = 0;
        int top = array.length-1;
        int middle = 0;
        while(bottom<top){
            middle = (bottom + top) / 2;
            if(element.equals(array[middle])){
                pos = middle;
                break;
            }
            if(compare(element, array[middle])){
                top = middle;
            } else{
                if(bottom == middle){
                    bottom++;
                } else{
                    bottom = middle;
                }
            }
        }
        if(pos == -1){
            if(element.equals(array[bottom])){
                pos = bottom;
            }
        }

        if(pos != -1){
            int min = pos;
            int max = pos;
            while(min > 0 && array[min-1].equals(element)){
                min--;
            }
            while(max<array.length-1 && array[max+1].equals(element)){
                max++;
            }
            return new Interval<Integer>(min, max);
        }
        return new Interval<Integer>(-1, -1);
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
