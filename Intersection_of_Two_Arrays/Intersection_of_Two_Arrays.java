package Intersection_of_Two_Arrays;

import java.lang.reflect.Array;
import java.util.HashSet;

public class Intersection_of_Two_Arrays {

    //Create the intersection of two arrays.
    public static <T> T[] intersection_of_Two_Arrays(T[] array1, T[] array2){
        HashSet<T> list = new HashSet<T>();
        for(T item : array1){
            if(!list.contains(item)){
                list.add(item);
            }
        }
        for(T item : array2){
            if(!list.contains(item)){
                list.add(item);
            }
        }
        T[] result = list.toArray((T[]) Array.newInstance(array1[0].getClass(), list.size()));
        return result;
    }
}
