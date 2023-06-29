package Valid_Palindrome;

public class Test_Valid_Palindrome {

    public static void main(String[] args) {
        test("Red rum, sir, is murder");
        test("Red rum, sir, isn't murder");
    }

    private static void test(String string){
        boolean result = Valid_Palindrome.valid_Palindrom(string);

        System.out.println("Given: " + string);
        System.out.println("Result: " + result);
    }
}
