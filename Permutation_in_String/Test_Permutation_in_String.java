package Permutation_in_String;

public class Test_Permutation_in_String {

    public static void main(String[] args) {
        test("I like programming very much.", "money");
        test("I like programming very much.", "zero");
    }

    private static void test(String string1, String string2){
        Boolean result = Permutation_in_String.permutation_in_String(string1, string2);

        System.out.println(String.format("Given: \"%s\" and \"%s\"", string1, string2));
        System.out.println("Result: " + result);
    }
}
