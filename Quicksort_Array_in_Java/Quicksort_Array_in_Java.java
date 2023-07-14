package Quicksort_Array_in_Java;

import java.util.Comparator;

public class Quicksort_Array_in_Java {

    //Quicksort of an Array.
    public static <T> void quicksort_Array_in_Java(T[] array, Comparator<T> comparator){
        sort_Area_prepeare(array, comparator, 0, array.length-1);
    }

    private static <T> void sort_Area(T[] array, Comparator<T> comparator, int start, int end){
        int i = start;
        int j = end-1;
        T pilot = array[end];
        T setSmaller = null;
        T setHigher = null;
        while(j >= i){
            //System.out.println(String.format("Value i = %s  j = %s, Index i = %s j = %s", array[i], array[j], i, j));
            if(setHigher != null && setSmaller != null){
                swap(array, i, j);
                setSmaller = null;
                setHigher = null;
            }
            if(setHigher == null){
                if(comparator.compare(pilot, array[i]) == -1){
                    setHigher = array[i];
                } else{
                    i++;
                }
            }
            if(setSmaller == null){
                if(comparator.compare(array[j], pilot) == -1){
                    setSmaller = array[j];
                } else{
                    j--;
                }
            }
        }
        if(setHigher != null){
            swap(array, i, end);
        }
        sort_Area_prepeare(array, comparator, start, i-1);
        sort_Area_prepeare(array, comparator, i+1, end);
    }

    private static <T> void sort_Area_prepeare(T[] array, Comparator<T> comparator, int start, int end){
        if(start < end){
            sort_Area(array, comparator, start, end);
        }
    }

    private static <T> void swap(T[] array, int i, int j){
        T memory = array[i];
        array[i] = array[j];
        array[j] = memory;
    }
}
