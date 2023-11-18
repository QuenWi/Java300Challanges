package Verify_Preorder_Serialization_of_a_Binary_Tree;

import Helpers.PrintArrayOrList;

import java.util.ArrayList;
import java.util.List;

public class Test_Verify_Preorder_Serialization_of_a_Binary_Tree {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(){{
            add(1); add(2); add(3); add(4); add(null); add(5); add(null); add(6);
            add(7); add(8); add(null); add(9); add(10); add(null); add(11);
        }};
        List<Integer> list2 = new ArrayList<>(){{
            add(1); add(2); add(3); add(4); add(null); add(null); add(null); add(6);
            add(7); add(8); add(null); add(9); add(10); add(null); add(11);
        }};
        test(list);
        test(list2);
    }

    private static void test(List<Integer> list){
        Boolean result = Verify_Preorder_Serialization_of_a_Binary_Tree.verify_Preorder_Serialization_of_a_Binary_Tree(list);

        System.out.println("Given: " + PrintArrayOrList.listToString(list));
        System.out.println("Result: " + result.toString());
    }
}
