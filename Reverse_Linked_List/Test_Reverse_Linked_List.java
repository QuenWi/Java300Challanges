package Reverse_Linked_List;

import Helpers.PrintArrayOrList;

import java.util.LinkedList;

public class Test_Reverse_Linked_List {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(){{
            add(1); add(2); add(3); add(4); add(5); add(6); add(7);
        }};
        test(list);
    }

    private static void test(LinkedList<Integer> list){
        System.out.println("Given: " + PrintArrayOrList.listToString(list));
        Reverse_Linked_List.reverse_Linked_List(list);
        System.out.println("Result: " + PrintArrayOrList.listToString(list));
    }
}
