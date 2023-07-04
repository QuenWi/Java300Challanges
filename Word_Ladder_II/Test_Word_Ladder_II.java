package Word_Ladder_II;

import Helpers.PrintArrayOrList;
import Word_Ladder.Word_Ladder;

public class Test_Word_Ladder_II {

    public static void main(String[] args) {
        test(new String[]{"star", "cat", "ena", "dog", "coma","sna", "sta", "more"}, "start", "end");
        test(new String[]{"star", "cat", "dog", "coma","sna", "sta", "more"}, "start", "end");
    }

    private static void test(String[] array, String start, String end){
        String[] result = Word_Ladder_II.word_Ladder_II(array, start, end);

        System.out.println(String.format("Given: array %s, start \"%s\", end \"%s\"", PrintArrayOrList.arrayToString(array), start, end));
        System.out.println("Result: " + PrintArrayOrList.arrayToString(result));
    }
}
