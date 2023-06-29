package Find_Minimum_in_Rotated_Sorted_Array;

import Helpers.PrintArrayOrList;

public class Test_Find_Minimum_in_Rotated_Sorted_Array {

    public static void main(String[] args) {
        test(new Integer[]{4, 5, 6, 7, 8, 10, 12, 1, 2, 3});
        test(new Integer[]{4, 5, 6, 7, 8, 10, 12, 1, 1, 2, 3});
        test(new Integer[]{13, 4, 5, 6, 7, 8, 10, 12});
        test(new Integer[]{4, 5, 6, 7, 8, 10, 12});
    }

    private static void test(Integer[] array){
        Integer result = Find_Minimum_in_Rotated_Sorted_Array.find_Minimum_in_Roated_Sorted_Array(array);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Result: " + result.toString());

    }
}
