package Merge_Sorted_Array;

import Helpers.PrintArrayOrList;

public class Test_Merge_Sorted_Array {

    public static void main(String[] args) {
        Float[] array = {1f, 3.4f, 4.1f, 4.2f, 5f, 5.5f, 5.6f, 6f, 7.1f};
        Float[] mergeInto = {0.5f, 3.4f, 4f, 4.05f, 5.5f, 5.55f, 6.1f, 8f};
        Float[] result = Merge_Sorted_Array.merge_Sorted_Array(array, mergeInto);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Merging with: " + PrintArrayOrList.arrayToString(mergeInto));
        System.out.println("Result: " + PrintArrayOrList.arrayToString(result));
    }
}
