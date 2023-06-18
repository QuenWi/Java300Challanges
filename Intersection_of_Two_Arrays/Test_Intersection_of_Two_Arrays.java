package Intersection_of_Two_Arrays;

import Helpers.PrintArrayOrList;

public class Test_Intersection_of_Two_Arrays {

    public static void main(String[] args) {
        Character[] array1 = {'a', 'b', 'c', 'd', 'e', 'f'};
        Character[] array2 = {'x', 'y', 'z', 'd', 'e', 'f'};
        Character[] result = Intersection_of_Two_Arrays.intersection_of_Two_Arrays(array1, array2);

        System.out.println("Given 1: " + PrintArrayOrList.arrayToString(array1));
        System.out.println("Given 2: " + PrintArrayOrList.arrayToString(array2));
        System.out.println("Result: " + PrintArrayOrList.arrayToString(result));
    }
}
