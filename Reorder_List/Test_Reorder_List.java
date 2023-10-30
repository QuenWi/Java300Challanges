package Reorder_List;

import Helpers.PrintArrayOrList;

import java.util.LinkedList;

public class Test_Reorder_List {

    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<Character>(){{
           add('a'); add('b'); add('c'); add('d'); add('e'); add('f'); add('g'); add('h');
        }};
        LinkedList<Character> list2 = new LinkedList<Character>(){{
            add('a'); add('b'); add('c'); add('d'); add('e'); add('f'); add('g'); add('h'); add('k'); add('l'); add('m'); add('n');
        }};
        LinkedList<Character> list3 = new LinkedList<Character>(){{
            add('1'); add('2'); add('3'); add('4'); add('5'); add('6'); add('7'); add('8'); add('9'); add('0'); add('a'); add('b'); add('c'); add('d'); add('e'); add('f');
        }};
        test(list);
        test(list2);
        test(list3);
    }

    private static void test(LinkedList<Character> list){
        System.out.println("Given: " + PrintArrayOrList.listToString(list));
        Reorder_List.reorder_List(list);
        System.out.println("Result: " + PrintArrayOrList.listToString(list));
    }
}
