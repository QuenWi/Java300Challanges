package Repeated_String_Match;

public class Test_Repeated_String_Match {

    public static void main(String[] args) {
        String string1 = "abcdefc";
        String string2 = "defcabcdefcabcdefcabcdefcabcdefcabcdefcabcdefcabcdefcabcd";
        String string3 = "defcabcdefcabcdefcabcdefcaKKcdefcabcdefcabcdefcabcdefcabcd";

        System.out.println("Given: " + string1);
        System.out.println("String2: " + Repeated_String_Match.repeated_String_Match(string1, string2));
        System.out.println("String3: " + Repeated_String_Match.repeated_String_Match(string1, string3));
    }
}
