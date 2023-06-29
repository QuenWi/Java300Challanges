package One_Edit_Distance;

public class Test_One_Edit_Distance {

    public static void main(String[] args) {
        test("See if you can find the typo.", "Sea if you can find the typo.");
        test("See if you can find the typo.", "See, if you can find the typo.");
        test("See if you can find the typo.", "Sea, if you can find the typo.");
        test("See if you can find the typo.", "See if you can't find the typo.");
        test("See if you can find the typo.", "See, if you can find the typo!");
    }

    private static void test(String string1, String string2){
        System.out.println("Given: " + string1);
        System.out.println("Result for \"" + string2 + "\": " + One_Edit_Distance.one_Edit_Distance(string1, string2));
    }
}
