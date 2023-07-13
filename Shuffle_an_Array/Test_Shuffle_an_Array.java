package Shuffle_an_Array;

import Helpers.PrintArrayOrList;

public class Test_Shuffle_an_Array {

    public static void main(String[] args) {
        test(new Character[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l'});
    }

    private static void test(Character[] array){
        Character[] result = Shuffle_an_Array.shuffle_an_Array(array);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Result: " + PrintArrayOrList.arrayToString(result));
    }
}
