package Reverse_Words_in_a_String_II;

import Reverse_Vowels_of_a_String.Reverse_Vowels_of_a_String;

public class Test_Reverse_Words_in_a_String_II {

    public static void main(String[] args) {
        test("This is a normal sentence.");
    }

    private static void test(String string){
        String result = Reverse_Words_in_a_String_II.reverse_Words_in_a_String_II(string);

        System.out.println("Given: " + string);
        System.out.println("Result: " + result);
    }
}
