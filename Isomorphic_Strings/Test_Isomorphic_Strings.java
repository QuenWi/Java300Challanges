package Isomorphic_Strings;

import java.util.HashMap;

public class Test_Isomorphic_Strings {

    public static void main(String[] args) {
        String string1 = "Do something.";
        String string2 = "The huge code";
        //String string2 = "abcdbefghijkl";
        Boolean result = Isomorphic_Strings.isomorphic_Strings(string1, string2, true);
        Boolean result2 = Isomorphic_Strings.isomorphic_Strings(string1, string2, false);

        System.out.println("Given: \"" + string1 + "\" and \"" + string2 + "\"");
        System.out.println("Result surjectiv: " + result);
        System.out.println("Result not surjectiv: " + result2);
    }
}
