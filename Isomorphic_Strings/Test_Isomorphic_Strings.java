package Isomorphic_Strings;

import java.util.HashMap;

public class Test_Isomorphic_Strings {

    public static void main(String[] args) {
        test("Do something.", "The huge code", true);
        test("Do something.", "The huge code", false);
        test("Do something.", "abcdbefghijkl", true);
    }

    private static void test(String string1, String string2, boolean surjectiv){
        Boolean result = Isomorphic_Strings.isomorphic_Strings(string1, string2, surjectiv);

        System.out.println("Given: \"" + string1 + "\" and \"" + string2 + "\"");
        System.out.println("Result surjectiv " + surjectiv + ": " + result);
    }
}
