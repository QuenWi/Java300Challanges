package Remove_Linked_List_Elements;

import Helpers.PrintArrayOrList;

import java.util.ArrayList;
import java.util.List;

public class Test_Remove_Linked_List_Elements {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(){{
            add("a"); add("b"); add("c"); add("a"); add("aa"); add("ac"); add("_"); add("d"); add("a");
        }};
        test(list, "a");
    }

    private static void test(List<String> list, String element){
        System.out.println("Given: " + PrintArrayOrList.listToString(list) + " and " + element.toString());
        Remove_Linked_List_Elements.remove_Linked_List_Elements(list, element);
        System.out.println("Result: " + PrintArrayOrList.listToString(list));
    }
}
