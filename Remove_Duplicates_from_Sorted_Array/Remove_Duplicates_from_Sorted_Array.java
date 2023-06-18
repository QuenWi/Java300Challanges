package Remove_Duplicates_from_Sorted_Array;

import Helpers.PrintArrayOrList;

import java.util.ArrayList;
import java.util.List;

public class Remove_Duplicates_from_Sorted_Array {

    //Allow in a sorted Array no equal elements.
    public static <T> int remove_duplicates_from_sorted_array(T[] array){
        boolean first = true;
        if(array.length == 0){
            return 0;
        }
        int result = 1;

        for(int i = 1; i < array.length; i++){
            if(!array[i].equals(array[result - 1])) { //We have here an Object, not an primitive variable
                if (result != i) {
                    array[result] = array[i];
                }
                result++;
            }
        }
        return result;
    }
}
