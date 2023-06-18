package Backspace_String_Compare;

public class Test_Backspace_String_Compare {

    public static void main(String[] args) {
        String string1 = "abc#def##g"; //abdg
        String string2 = "##jkabc#defi###g"; //abdg
        String string3 = "abc##def##g"; //adg
        String string4 = "#####a###lpnfmsd#babd#e#duu##g"; //abdg

        System.out.println("Given: " + string1);
        System.out.println("Result for " + string2 + ": " + Backspace_String_Compare.backspace_String_Compare(string1, string2));
        System.out.println("Result for " + string3 + ": " + Backspace_String_Compare.backspace_String_Compare(string1, string3));
        System.out.println("Result for " + string4 + ": " + Backspace_String_Compare.backspace_String_Compare(string1, string4));
    }
}
