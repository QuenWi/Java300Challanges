package Swap_Nodes_in_Pairs;

import Helpers.PrintArrayOrList;

import java.util.ArrayList;
import java.util.List;

public class Test_Swap_Nodes_in_Pairs {

    public static void main(String[] args) {
        List<Character> list = new ArrayList<>(){{
            add('a'); add('b'); add('c'); add('d'); add('e'); add('f'); add('g');
        }};
        test(list);
    }

    private static void test(List<Character> list){
        System.out.println("Given: " + PrintArrayOrList.listToString(list));
        Swap_Nodes_in_Pairs.swap_Nodes_in_Pairs(list);
        System.out.println("Result: " + PrintArrayOrList.listToString(list));
    }
}
