package Longest_Substring_with_At_Most_K_Distinct_Characters;

public class Test_Longest_Substring_with_At_Most_K_Distinct_Characters {

    public static void main(String[] args) {
        test("aaabaaccbbccbbdddeedddffffeeefggghhhffggjjjgghh", 3);
        test("ababcbcbbebbeebffggf", 2);
        test("aaabb", 2);
        test("aaabbc", 2);
        test("abbcc", 2);
    }

    private static void test(String string, Integer k){
        Integer result = Longest_Substring_with_At_Most_K_Distinct_Characters.longest_Substring_with_At_Most_K_Distinct_Characters(string, k);

        System.out.println("Given: " + string);
        System.out.println("Result for " + k + ": " + result);
    }
}
