package Rotate_Array_in_Java;

import Helpers.PrintArrayOrList;

public class Test_Rotate_Array_in_Java {

    public static void main(String[] args) {
        test(new Character[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'k'}, 5);
        test(new Character[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'k'}, -1);
        test(new Character[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'k'}, 50);
        test(new Character[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'k'}, 51);
    }

    private static void test(Character[] array, Integer k){
        Character[] result = Rotate_Array_in_Java.rotate_Array_in_Java(array, k);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array) + ", " + k.toString());
        System.out.println("Result: " + PrintArrayOrList.arrayToString(result));
    }
}
