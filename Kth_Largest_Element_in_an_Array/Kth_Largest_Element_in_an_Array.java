package Kth_Largest_Element_in_an_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Kth_Largest_Element_in_an_Array {

    //return the k largest number from an array.
    public static <T> T kth_Largest_Element_in_an_Array(T[] array, Integer k, Comparator<T> comparator){
        List<T> list = new ArrayList<T>(Arrays.stream(array).toList());
        list.sort(comparator);
        return list.get(array.length - k);
    }
}
