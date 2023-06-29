package Reverse_Vowels_of_a_String;

public class Test_Reverse_Vowels_of_a_String {

    public static void main(String[] args) {
        test("It does not matter how fast you go, as long you keep going.");
    }

    private static void test(String string){
        String result = Reverse_Vowels_of_a_String.reverse_Vowels_of_a_String(string);

        System.out.println("Given: " + string);
        System.out.println("Result: " + result);
    }
}
