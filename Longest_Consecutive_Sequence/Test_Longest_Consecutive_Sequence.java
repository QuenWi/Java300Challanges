package Longest_Consecutive_Sequence;

import Helpers.PrintArrayOrList;

public class Test_Longest_Consecutive_Sequence {

    public static void main(String[] args) {
        test(new Integer[] {5, 10, 11, 24, 4, 22, 13, 3, 2, 12, 6, 34});
    }

    private static void test(Integer[] array){
        Integer result = Longest_Consecutive_Sequence.longest_Consecutive_Sequence(array);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Result: " + result.toString());
    }
}
