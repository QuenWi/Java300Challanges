package Merge_Sorted_Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Sorted_Array {

    //You have two sorted arrays and should merge them together.
    public static <T extends Number> T[] merge_Sorted_Array(T[] array1, T[]array2){
        List<T> result = new ArrayList<T>();
        int i = 0;
        int j = 0;
        while(i < array1.length || j < array2.length){
            if(i >= array1.length){
                result.add(array2[j]);
                j++;
            } else if(j >= array1.length){
                result.add(array1[i]);
                i++;
            } else{
                if(array1[i].floatValue() == array2[j].floatValue()){
                    result.add(array1[i]);
                    i++;
                    j++;
                } else if(array1[i].floatValue() > array2[j].floatValue()){
                    result.add(array2[j]);
                    j++;
                } else{
                    result.add(array1[i]);
                    i++;
                }
            }

        }

        T[] result2 = result.toArray((T[]) Array.newInstance(array1[0].getClass(), result.size()));
        return result2;
    }
}
