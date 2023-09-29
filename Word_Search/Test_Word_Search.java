package Word_Search;

import Helpers.PrintArrayOrList;

public class Test_Word_Search {

    public static void main(String[] args) {
        Character[][] matrix = new Character[][]{
                {'a', 'l', 'c', 'u', 'm', 'o'},
                {'t', 'l', 'a', 's', 's', 'p'},
                {'i', 't', 'n', 'u', 'z', 'b'},
                {'s', 'l', 'c', 'v', 'h', 'g'},
                {'q', 'd', 'x', 'a', 'n', 'e'},
                {'w', 'e', 'r', 's', 'n', 'i'},
        };
        test(matrix, "atlas");
        test(matrix, "atlantis");
        test(matrix, "insane");
        test(matrix, "zylinder");
    }

    private static void test(Character[][] matrix, String string){
        Boolean result = Word_Search.word_Search(matrix, string);

        System.out.println("Given: " + string + " and " + PrintArrayOrList.arrayMatrixToString(matrix));
        System.out.println("Result: " + result.toString());
    }
}
