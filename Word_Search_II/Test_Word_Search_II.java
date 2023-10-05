package Word_Search_II;

import Helpers.PrintArrayOrList;

public class Test_Word_Search_II {

    public static void main(String[] args) {
        Character[][] matrix = new Character[][]{
                {'a', 'l', 'c', 'u', 'm', 'o'},
                {'t', 'l', 'a', 's', 's', 'p'},
                {'i', 't', 'n', 'u', 'z', 'b'},
                {'s', 'l', 'c', 'v', 'h', 'g'},
                {'q', 'd', 'x', 'a', 'n', 'e'},
                {'w', 'e', 'r', 's', 'n', 'i'},
        };
        test(matrix, new String[]{"atlas", "atlantis", "zylinder", "insane", "enax"});
    }

    private static void test(Character[][] matrix, String[] words){
        Boolean[] result = Word_Search_II.word_Search_II(matrix, words);

        System.out.println(String.format("Given: %S and %s", PrintArrayOrList.arrayToString(words), PrintArrayOrList.arrayMatrixToString(matrix)));
        System.out.println("Result: " + PrintArrayOrList.arrayToString(result));
    }
}
