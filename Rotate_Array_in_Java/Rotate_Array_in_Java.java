package Rotate_Array_in_Java;

import java.lang.reflect.Array;

public class Rotate_Array_in_Java {

    //Rotates an Array by k
    public static <T> T[] rotate_Array_in_Java(T[] array, Integer k)
    {
        while(0 > k){
            k += array.length;
        }
        T[] result = (T[])Array.newInstance(array[0].getClass(), array.length);
        for(int i = 0; i < array.length; i++){
            result[i] = array[((i+k)%(array.length))];
        }
        return result;
    }
}
