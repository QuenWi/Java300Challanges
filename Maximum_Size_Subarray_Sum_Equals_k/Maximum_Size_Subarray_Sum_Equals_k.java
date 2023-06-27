package Maximum_Size_Subarray_Sum_Equals_k;

import Helpers.PrintArrayOrList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Maximum_Size_Subarray_Sum_Equals_k {

    //How many Elements maximum are needed to get a Sum from an Array
    public static <T extends Number> Integer maximum_Size_Subarray_Sum_Equals_k(T[] array, T wanted){
        HashMap<ArrayList<Integer>, T> hashMap = new HashMap<ArrayList<Integer>, T>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        T sum = subtraction(array[0], array[0]);
        for(int i = 0; i < array.length; i++){
            arrayList.add(i);
            sum = sum(sum, array[i]);
        }
        hashMap.put(arrayList, sum);
        for(int i = array.length-2; i >= 0; i--){
            HashMap<ArrayList<Integer>, T> newHashMap = new HashMap<ArrayList<Integer>, T>();
            for(int j = 0; j < array.length; j++){
                for(ArrayList<Integer> al : hashMap.keySet()){
                    if(al.contains(j)){
                        //System.out.println(hashMap.get(al).toString());
                        T newSum = subtraction(hashMap.get(al), array[j]);
                        if(newSum.equals(wanted)){
                            /*ArrayList<Integer> newList = (ArrayList<Integer>)al.clone();
                            newList.remove(newList.indexOf(j));
                            System.out.println("Result: " + PrintArrayOrList.listToString(newList));*/
                            return i;
                        }
                        ArrayList<Integer> newList = (ArrayList<Integer>)al.clone();
                        //System.out.println(PrintArrayOrList.listToString(newList) + " " + j + " " + newList.indexOf(j));
                        newList.remove(newList.indexOf(j));
                        if(compare(wanted, newSum)){
                            newHashMap.put(newList, newSum);
                        }
                    }
                }
            }
            hashMap = newHashMap;
        }
        return -1;
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
