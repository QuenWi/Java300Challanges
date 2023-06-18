package One_Edit_Distance;

public class Test_One_Edit_Distance {

    public static void main(String[] args) {
        String string1 = "See if you can find the typo.";
        String string2 = "Sea if you can find the typo.";
        String string3 = "See, if you can find the typo.";
        String string4 = "Sea, if you can find the typo.";
        String string5 = "See if you can't find the typo.";
        String string6 = "See, if you can find the typo!";

        System.out.println("Given: " + string1);
        System.out.println("Result for \"" + string2 + "\": " + One_Edit_Distance.one_Edit_Distance(string1, string2));
        System.out.println("Result for \"" + string3 + "\": " + One_Edit_Distance.one_Edit_Distance(string1, string3));
        System.out.println("Result for \"" + string4 + "\": " + One_Edit_Distance.one_Edit_Distance(string1, string4));
        System.out.println("Result for \"" + string5 + "\": " + One_Edit_Distance.one_Edit_Distance(string1, string5));
        System.out.println("Result for \"" + string6 + "\": " + One_Edit_Distance.one_Edit_Distance(string1, string6));
    }
}
