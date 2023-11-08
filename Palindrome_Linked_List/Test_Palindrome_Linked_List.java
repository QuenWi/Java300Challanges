package Palindrome_Linked_List;

import Helpers.PrintArrayOrList;

import java.util.LinkedList;


public class Test_Palindrome_Linked_List {

    public static void main(String[] args) {
        LinkedList<Long> list = new LinkedList<>(){{
            add(1l); add(2l); add(3l); add(4l); add(4l); add(3l); add(2l); add(1l);
        }};
        test(list);
        list.remove(4);
        test(list);
        list.add(5l);
        test(list);
    }

    private static void test(LinkedList<Long> list){
        Boolean result = Palindrome_Linked_List.palindrom_Linked_List(list);

        System.out.println("Given: " + PrintArrayOrList.listToString(list));
        System.out.println("Result: " + result.toString());
    }
}
