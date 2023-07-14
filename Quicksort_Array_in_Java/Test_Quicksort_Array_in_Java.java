package Quicksort_Array_in_Java;

import Helpers.PrintArrayOrList;

import java.util.Comparator;
import java.util.Random;

public class Test_Quicksort_Array_in_Java {

    public static void main(String[] args) {
        Comparator<Float> comparator = new Comparator<Float>() {
            @Override
            public int compare(Float o1, Float o2) {
                return Float.compare(o1, o2);
            }
        };
        test(new Float[]{2.2f, 6.4f, 93.3f, 8.2f, 3.2f, 7.5f, 3.4f, 16.4f, 845.3f, 7.3f, 7.3f}, comparator);
        Float[] array = new Float[100];
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] =  ((Integer)(random.nextInt(1000))).floatValue() / 100;
        }
        test(array, comparator);
    }

    private static void test(Float[] array, Comparator<Float> comparator){
        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        Quicksort_Array_in_Java.quicksort_Array_in_Java(array, comparator);
        System.out.println("Result: " + PrintArrayOrList.arrayToString(array));
    }
}
