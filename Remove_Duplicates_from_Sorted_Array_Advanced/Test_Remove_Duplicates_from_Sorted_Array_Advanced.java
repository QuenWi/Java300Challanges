package Remove_Duplicates_from_Sorted_Array_Advanced;

import Helpers.PrintArrayOrList;
import Remove_Duplicates_from_Sorted_Array.Remove_Duplicates_from_Sorted_Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test_Remove_Duplicates_from_Sorted_Array_Advanced {
    public static void main(String[] args) {
        List<Float> list = new ArrayList<Float>();
        for(int i = 0; i < 20; i++){
            list.add((float)i);
        }
        for(int i = 0; i < 10; i++){
            list.add((float)(i+1)*2);
        }
        for(int i = 0; i < 7; i++){
            list.add((float)(i+1)*3);
        }
        Collections.sort(list);
        test(list);
    }

    private static void test(List<Float> list){
        Float[] array = list.toArray(Float[]::new); //Just an array for testing
        System.out.println("Before: " + PrintArrayOrList.arrayToString(array));
        int size;
        size = Remove_Duplicates_from_Sorted_Array_Advanced.remove_duplicates_from_sorted_array_advanced(array, 2);
        System.out.println("After: " + PrintArrayOrList.arrayToString(array) + ", size: " + size);
        Float[] array2 = new Float[size];
        for(int i = 0; i < size; i++){
            array2[i] = array[i];
        }
        System.out.println("Resulting: " + PrintArrayOrList.arrayToString(array2));
    }
}
