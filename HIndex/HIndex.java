package HIndex;

import Helpers.PrintArrayOrList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HIndex {

    //Gives back the HIndex of an Array
    public static Integer hIndex(Integer[] arrayUnsorted){
        int hIndex = 0;
        Integer[] array = arrayUnsorted.clone();
        Arrays.sort(array);
        int bottom = 0;
        int top = array.length-1;
        int middle;
        while(bottom != top){
            middle = (top + bottom)/2;
            if(array[middle] > array.length-middle){
                top = middle;
            } else{
                if(middle == bottom){
                    if(hIndex < array[middle]){
                        hIndex = array[middle];
                    }
                    bottom++;
                } else{
                    if(hIndex < array[middle]){
                        hIndex = array[middle];
                    }
                    bottom = middle;
                }
            }
        }
        if(array.length-bottom == array[bottom]){
            if(hIndex < array[bottom]){
                hIndex = array[bottom];
            }
        }

        return hIndex;
    }
}
