package Shuffle_an_Array;

import java.lang.reflect.Array;
import java.util.*;

public class Shuffle_an_Array {

    //shuffeles an array
    public static <T> T[] shuffle_an_Array(T[] array){
        T[] result = (T[])Array.newInstance(array[0].getClass(), array.length);
        List<T> list = new ArrayList<>(Arrays.asList(array));
        Random random = new Random();
        int memory;
        for(int i = 0; i < result.length; i++){
            memory = random.nextInt(list.size());
            result[i] = list.get(memory);
            list.remove(memory);
        }
        return result;
    }
}
