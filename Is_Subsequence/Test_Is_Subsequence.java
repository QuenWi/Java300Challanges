package Is_Subsequence;

public class Test_Is_Subsequence {

    public static void main(String[] args) {
        test("abcdefghijklmnop", "bcefglmnop");
        test("abcdefghijklmnop", "acdeijnopq");
        test("abcdefghijklmnop", "ba");
    }

    private static void test(String string1, String string2){
        System.out.println("Given: " + string1);
        System.out.println("Result for " + string2 + ": " + Is_Subsequence.is_Subsequence(string1, string2));
    }
}
