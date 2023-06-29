package Repeated_String_Match;

public class Test_Repeated_String_Match {

    public static void main(String[] args) {
        test("abcdefc", "defcabcdefcabcdefcabcdefcabcdefcabcdefcabcdefcabcdefcabcd");
        test("abcdefc", "defcabcdefcabcdefcabcdefcaKKcdefcabcdefcabcdefcabcdefcabcd");
    }

    private static void test(String string1, String string2){
        System.out.println("Given: " + string1);
        System.out.println("String2 " + string2 + ": " + Repeated_String_Match.repeated_String_Match(string1, string2));
    }
}
