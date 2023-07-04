package Word_Ladder;

import Helpers.PrintArrayOrList;

public class Test_Word_Ladder {

    public static void main(String[] args) {
        test(new String[]{"star", "cat", "ena", "dog", "coma","sna", "sta", "more"}, "start", "end");
        test(new String[]{"star", "cat", "dog", "coma","sna", "sta", "more"}, "start", "end");
    }

    private static void test(String[] array, String start, String end){
        Integer result = Word_Ladder.word_Ladder(array, start, end);

        System.out.println(String.format("Given: array %s, start \"%s\", end \"%s\"", PrintArrayOrList.arrayToString(array), start, end));
        System.out.println("Result: " + result.toString());
    }
}
