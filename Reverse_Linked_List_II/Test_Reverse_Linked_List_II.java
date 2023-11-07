package Reverse_Linked_List_II;

import Helpers.PrintArrayOrList;
import Reverse_Linked_List.Reverse_Linked_List;

import java.util.LinkedList;
import java.util.List;

public class Test_Reverse_Linked_List_II {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(){{
            add(0); add(1); add(2); add(3); add(4); add(5); add(6); add(7); add(8); add(9);
        }};
        test(list, 4, 7);
        list = new LinkedList<>(){{
            add(0); add(1); add(2); add(3); add(4); add(5); add(6); add(7); add(8); add(9);
        }};
        test(list, 2, 4);
    }

    private static void test(List<Integer> list, Integer from, Integer to){
        System.out.println("Given: " + PrintArrayOrList.listToString(list) + ", " + from + " and " + to);
        Reverse_Linked_List_II.reverse_Linked_List_II(list, from, to);
        System.out.println("Result: " + PrintArrayOrList.listToString(list));
    }
}
