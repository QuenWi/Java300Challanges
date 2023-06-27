package Subarray_Sum_Equals_K;

import Helpers.PrintArrayOrList;

import java.util.HashMap;
import java.util.LinkedList;

public class Subarray_Sum_Equals_K {

    //How many continueous Subarrays have the sum?
    public static <T extends Number> Integer subarray_Sum_Equals_K(T[] array, T sum){
        Integer counter = 0;
        HashMap<LinkedList<Integer>, T> hashMap = new HashMap<LinkedList<Integer>, T>();
        T zero = subtraction(array[0], array[0]);
        for(int i = 0; i < array.length; i++){
            LinkedList<Integer> linkedList = new LinkedList<Integer>();
            linkedList.add(i);
            T sum2 = subtraction(sum, array[i]);
            hashMap.put(linkedList, sum2);
        }
        for(int i = 1; i < array.length; i++){
            HashMap<LinkedList<Integer>, T> newHashMap = new HashMap<LinkedList<Integer>, T>();
            for(LinkedList<Integer> ll :hashMap.keySet()){
                if(ll.getLast() + 1 == i){
                    LinkedList<Integer> linkedList = (LinkedList<Integer>) ll.clone();
                    linkedList.add(i);
                    T sum2 = hashMap.get(ll);
                    sum2 = subtraction(sum2, array[i]);
                    if(zero.equals(sum2)){
                        //System.out.println(sum2 + " " + PrintArrayOrList.listToString(linkedList));
                        counter++;
                    } else if(compare(zero, sum2)){
                        newHashMap.put(linkedList, sum2);
                    }
                } else{
                    newHashMap.put(ll, hashMap.get(ll));
                }
            }
            hashMap = newHashMap;
        }

        return counter;
    }

    private static <T extends Number> T sum(T nr1, T nr2){
        if(nr1 instanceof Float){
            return (T)(Number) (nr1.floatValue() + nr2.floatValue());
        } else if(nr1 instanceof Double){
            return (T)(Number) (nr1.doubleValue() + nr2.doubleValue());
        } else if(nr1 instanceof Integer){
            return (T)(Number) (nr1.intValue() + nr2.intValue());
        } else if(nr1 instanceof Long){
            return (T)(Number) (nr1.longValue() + nr2.longValue());
        } else if(nr1 instanceof Byte){
            return (T)(Number) (nr1.byteValue() + nr2.byteValue());
        } else if(nr1 instanceof Short){
            return (T)(Number) (nr1.shortValue() + nr2.shortValue());
        }
        return null;
    }

    private static <T extends Number> T subtraction(T nr1, T nr2){
        if(nr1 instanceof Float){
            return (T)(Number) (nr1.floatValue() - nr2.floatValue());
        } else if(nr1 instanceof Double){
            return (T)(Number) (nr1.doubleValue() - nr2.doubleValue());
        } else if(nr1 instanceof Integer){
            return (T)(Number) (nr1.intValue() - nr2.intValue());
        } else if(nr1 instanceof Long){
            return (T)(Number) (nr1.longValue() - nr2.longValue());
        } else if(nr1 instanceof Byte){
            return (T)(Number) (nr1.byteValue() - nr2.byteValue());
        } else if(nr1 instanceof Short){
            return (T)(Number) (nr1.shortValue() - nr2.shortValue());
        }
        return null;
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
