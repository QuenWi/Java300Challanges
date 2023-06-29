package Longest_Substring_Without_Repeating_Characters;

public class Test_Longest_Substring_Without_Repeating_Characters {

    public static void main(String[] args) {
        test("abcdeafghibabcdefgchijklmnopoqrstuvw");
        test("abcdefg");
        test("abcdefga");
        test("aaaaaa");
    }

    private static void test(String string){
        Integer result = Longest_Substring_Without_Repeating_Characters.longest_Substring_Without_Repeating_Character(string);

        System.out.println("Given: " + string);
        System.out.println("Result: " + result.toString());

    }
}
