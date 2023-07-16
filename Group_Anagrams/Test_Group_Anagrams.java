package Group_Anagrams;

import Helpers.PrintArrayOrList;

import java.util.List;

public class Test_Group_Anagrams {

    public static void main(String[] args) {
        test(new String[]{"Anna", "full", "here", "There", "Nana", "reeh", "lulf", "thing", "cmon", "text",
                "empty", "with", "here", "thiw", "okey", "keyo", "Pemty", "heer", "more"});
    }

    private static void test(String[] array){
        List<List<String>> result = Group_Anagrams.group_Anagrams(array);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Result: " + PrintArrayOrList.listMatrixToString(result));
    }
}
