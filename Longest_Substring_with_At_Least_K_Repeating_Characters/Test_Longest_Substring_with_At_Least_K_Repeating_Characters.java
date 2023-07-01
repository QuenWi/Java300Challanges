package Longest_Substring_with_At_Least_K_Repeating_Characters;

public class Test_Longest_Substring_with_At_Least_K_Repeating_Characters {

    public static void main(String[] args) {
        test("ABCDEABCDBDCAABCDEG", 3);
    }

    private static void test(String string, int min){
        String result = Longest_Substring_with_At_Least_K_Repeating_Characters.longest_Substring_with_At_Least_K_Repeating_Characters(string, min);

        System.out.println("Given: " + string);
        System.out.println("Result: " + result);
    }
}
