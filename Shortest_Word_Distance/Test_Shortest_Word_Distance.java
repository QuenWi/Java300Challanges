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

        String string1 = "The";
        String string2 = "is";
        String string3 = "The";
        String string4 = "calm"; //not in list
        String string5 = "calm.";
        String string6 = "calm.";

        int result1 = Shortest_Word_Distance.shortest_Word_Distance(array, string1, string2);
        int result2 = Shortest_Word_Distance.shortest_Word_Distance(array, string1, string3);
        int result3 = Shortest_Word_Distance.shortest_Word_Distance(array, string1, string4);
        int result4 = Shortest_Word_Distance.shortest_Word_Distance(array, string1, string5);
        int result5 = Shortest_Word_Distance.shortest_Word_Distance(array, string5, string6);

        System.out.println("Given: " + PrintArrayOrList.listToString(list));
        System.out.println("Result for " + string1 + " and " + string2 + ": " + result1);
        System.out.println("Result for " + string1 + " and " + string3 + ": " + result2);
        System.out.println("Result for " + string1 + " and " + string4 + ": " + result3);
        System.out.println("Result for " + string1 + " and " + string5 + ": " + result4);
        System.out.println("Result for " + string5 + " and " + string6 + ": " + result5);


    }
}
