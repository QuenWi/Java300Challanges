package Palindrome_Pairs;

import Helpers.PrintArrayOrList;

import java.util.List;

public class Test_Palindrome_Pairs {

    public static void main(String[] args) {
        String[] array = {"bat", "ta.b", "mAp", "cap", "pa m", "sam", "msa", "cam", "lp", "aoifne", "mac", "", "ba..t."};
        List<List<Integer>> result = Palindrome_Pairs.palindrome_Pairs(array);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Result: " + PrintArrayOrList.listMatrixToString(result));
    }
}
