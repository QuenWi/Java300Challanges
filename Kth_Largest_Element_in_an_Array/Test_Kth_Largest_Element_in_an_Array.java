package Kth_Largest_Element_in_an_Array;

import Helpers.PrintArrayOrList;

import java.util.Comparator;

public class Test_Kth_Largest_Element_in_an_Array {

    public static void main(String[] args) {
        Comparator<Character> comparator = new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return Character.compare(o1, o2);
            }
        };
        test(new Character[]{'b', 'k', 'a', 'l', 'm', 'c', 'e', 'g', 'd'}, 5, comparator);
    }

    private static void test(Character[] array, Integer k, Comparator<Character> comparator){
        Character result = Kth_Largest_Element_in_an_Array.kth_Largest_Element_in_an_Array(array, k, comparator);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array) + ", " + k.toString());
        System.out.println("Result: " + result.toString());
    }
}
