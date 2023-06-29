package Shortest_Word_Distance;

import Helpers.PrintArrayOrList;

import java.util.ArrayList;
import java.util.List;

public class Test_Shortest_Word_Distance {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("The");
        list.add("formular");
        list.add("for");
        list.add("success");
        list.add("is");
        list.add("patients.");
        list.add("The");
        list.add("best");
        list.add("virtue");
        list.add("is");
        list.add("staying");
        list.add("calm.");
        String[] array = list.toArray(String[]::new);

        test(array, "The", "is");
        test(array, "The", "The");
        test(array, "The", "calm");
        test(array, "The", "calm.");
        test(array, "The", "calm.");
        test(array, "calm.", "calm.");
    }

    static void test(String[] array, String string1, String string2){
        int result = Shortest_Word_Distance.shortest_Word_Distance(array, string1, string2);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Result for " + string1 + " and " + string2 + ": " + result);
    }
}
