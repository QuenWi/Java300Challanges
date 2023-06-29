package Remove_Duplicates_from_Sorted_Array;

import Helpers.PrintArrayOrList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test_Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        List<Float> list = new ArrayList<Float>();
        for(int i = 0; i < 14; i++){
            list.add((float)i);
        }
        for(int i = 0; i < 6; i++){
            list.add((float)(i+1)*2);
        }
        Collections.sort(list);
        test(list);
    }

    private static void test(List<Float> list){
        Float[] array = list.toArray(Float[]::new); //Just an array for testing
        System.out.println("Before: " + PrintArrayOrList.arrayToString(array));
        int size;
        size = Remove_Duplicates_from_Sorted_Array.remove_duplicates_from_sorted_array(array);
        System.out.println("After: " + PrintArrayOrList.arrayToString(array) + ", size: " + size);
        Float[] array2 = new Float[size];
        for(int i = 0; i < size; i++){
            array2[i] = array[i];
        }
        System.out.println("Resulting: " + PrintArrayOrList.arrayToString(array2));
    }
}
