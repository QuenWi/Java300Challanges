package Find_And_Replace_in_String;

public class Test_Find_And_Replace_in_String {

    public static void main(String[] args) {
        String string = "An answer for something is 24!";
        String[] sources = {"mooncake", "An", "!", "something", "24"};
        String[] targets = {"suncake", "The", "?", "everything", "42"};
        Integer[] indexes = {3, 0, 20, string.indexOf("some"), string.indexOf("24")};
        test(string, indexes, sources, targets);
    }

    private static void test(String string, Integer[] indexes, String[] sources, String[] targets){
        String result = Find_And_Replace_in_String.find_And_Replace_in_String(string, indexes, sources, targets);
        System.out.println("Given: " + string);
        System.out.println("Result: " + result);
    }
}
