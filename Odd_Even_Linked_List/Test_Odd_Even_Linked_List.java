package Odd_Even_Linked_List;

import Helpers.PrintArrayOrList;

import java.util.ArrayList;
import java.util.List;

public class Test_Odd_Even_Linked_List {

    public static void main(String[] args) {
        List<Character> list1 = new ArrayList<>(){{
            add('1'); add('2'); add('3'); add('4'); add('5'); add('6'); add('7'); add('8'); add('9');
        }};
        test(list1);
        List<Character> list2 = new ArrayList<>(){{
            add('1'); add('2'); add('3'); add('4'); add('5'); add('6'); add('7'); add('8'); add('9'); add('0');
        }};
        test(list2);
    }

    private static void test(List<Character> list){
        System.out.println("Given: " + PrintArrayOrList.listToString(list));
        Odd_Even_Linked_List.odd_Even_Linked_List(list);
        System.out.println("Result: " + PrintArrayOrList.listToString(list));
    }
}
