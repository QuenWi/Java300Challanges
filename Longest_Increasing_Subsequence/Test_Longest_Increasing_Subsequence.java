package Longest_Increasing_Subsequence;

import Helpers.PrintArrayOrList;

public class Test_Longest_Increasing_Subsequence {

    public static void main(String[] args) {
        Float[] array = {1f, 0.5f, 0.6f, 2f, 1.2f, 6f, 8f, 1.4f, 1.1f, 1.2f, 4f, 3.3f, 4.5f, 6f, 1.3f, 3.4f, 3.3f, 3.5f, 3.6f};
        Integer result = Longest_Increasing_Subsequence.longest_Increasing_Subsequence(array);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Result: " + result.toString());
    }
}
