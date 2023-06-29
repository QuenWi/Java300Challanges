package Median_of_Two_Sorted_Arrays;

import Helpers.PrintArrayOrList;

public class Test_Median_of_Two_Sorted_Arrays {

    public static void main(String[] args) {
        test(new Float[] {-0.4f, 0f, 0.2f, 0.5f, 0.8f, 0.9f, 1.2f, 1.3f, 2f, 5f}, new Float[] {-0.3f, -0.1f, 0.4f, 1.1f});
    }

    private static void test(Float[] array1, Float[] array2){
        Float result = Median_of_Two_Sorted_Arrays.median_of_Two_Sorted_Arrays(array1, array2);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array1) + " and " + PrintArrayOrList.arrayToString(array2));
        System.out.println("Result: " + result.toString());
    }
}
