package Valid_Palindrome;

public class Test_Valid_Palindrome {

    public static void main(String[] args) {
        String string = "Red rum, sir, is murder";
        String string2 = "Red rum, sir, isn't murder";
        boolean result = Valid_Palindrome.valid_Palindrom(string);
        boolean result2 = Valid_Palindrome.valid_Palindrom(string2);

        System.out.println("Given: " + string);
        System.out.println("Result: " + result);
        System.out.println("Given: " + string2);
        System.out.println("Result: " + result2);
    }
}
