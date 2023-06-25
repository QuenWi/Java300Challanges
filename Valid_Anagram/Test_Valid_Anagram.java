package Valid_Anagram;

public class Test_Valid_Anagram {

    public static void main(String[] args) {
        String string1 = "I'm learned each day coding.";
        String string2 = "I'm learning each day coded!";
        //String string2 = "I'm learning each dayy coded!";
        Boolean result = Valid_Anagram.valid_Anagram(string1, string2);

        System.out.println("Given: \"" + string1 + "\" and \"" + string2 + "\"");
        System.out.println("Result: " + result);
    }
}
