package Minimum_Window_Substring;

public class Test_Minimum_Window_Substring {

    public static void main(String[] args) {
        test("sometimes you just have to write some random thing.", "something");
        test("A has a way to come from Z", "From A to Z");
        test("A has a way to come From Z", "From A to Z");
        test("From everyone I get every one who wants.", "everyone");
    }

    private static void test(String string1, String string2){
        String result = Minimum_Window_Substring.minimum_Window_Substring(string1, string2);

        System.out.println(String.format("Given: \"%s\" and \"%s\"", string1, string2));
        System.out.println("Result: " + result);
    }
}
