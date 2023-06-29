package Valid_Anagram;

public class Test_Valid_Anagram {

    public static void main(String[] args) {
        test("I'm learned each day coding.", "I'm learning each day coded!");
        test("I'm learned each day coding.", "I'm learning each dayy coded!");
    }

    private static void test(String string1, String string2){
        Boolean result = Valid_Anagram.valid_Anagram(string1, string2);

        System.out.println("Given: \"" + string1 + "\" and \"" + string2 + "\"");
        System.out.println("Result: " + result);
    }
}
