package Backspace_String_Compare;

public class Test_Backspace_String_Compare {

    public static void main(String[] args) {
        String string1 = "abc#def##g"; //abdg
        test(string1, "##jkabc#defi###g");
        test(string1, "abc##def##g");
        test(string1, "#####a###lpnfmsd#babd#e#duu##g");
    }

    private static void test(String string1, String string2){
        System.out.println("Given: " + string1);
        System.out.println("Result for " + string2 + ": " + Backspace_String_Compare.backspace_String_Compare(string1, string2));
    }
}
