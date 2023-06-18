package Is_Subsequence;

public class Test_Is_Subsequence {

    public static void main(String[] args) {
        String string1 = "abcdefghijklmnop";
        String string2 = "bcefglmnop";
        String string3 = "acdeijnopq";
        String string4 = "ba";

        System.out.println("Given: " + string1);
        System.out.println("Result for " + string2 + ": " + Is_Subsequence.is_Subsequence(string1, string2));
        System.out.println("Result for " + string3 + ": " + Is_Subsequence.is_Subsequence(string1, string3));
        System.out.println("Result for " + string4 + ": " + Is_Subsequence.is_Subsequence(string1, string4));
    }
}
