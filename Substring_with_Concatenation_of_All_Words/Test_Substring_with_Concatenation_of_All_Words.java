package Substring_with_Concatenation_of_All_Words;

import Helpers.PrintArrayOrList;

public class Test_Substring_with_Concatenation_of_All_Words {

    public static void main(String[] args) {
        test("I want to see what the subarray is, which has all the words.", new String[]{"the", "subarray", "to"});
        test("I want to see what the subarray is, which has all the words.", new String[]{"the", "subarray", "together"}); //it has not together, so it is empty
        test("I want to see what the subarray is, which has all the words.", new String[]{"subarray"});
    }

    private static void test(String string, String[] array){
        String result = Substring_with_Concatenation_of_All_Words.substring_with_Concatenation_of_All_Words(string, array);

        System.out.println("Given: \"" + string + "\" and \"" + PrintArrayOrList.arrayToString(array) + "\"");
        System.out.println("Result: " + result);
    }
}
