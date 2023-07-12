package Linked_List_Random_Node;

import Helpers.PrintArrayOrList;

import java.util.LinkedList;

public class Test_Linked_List_Random_Node {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 0; i < 100; i++){
            linkedList.add(i);
        }
        test(linkedList);
    }

    private static void test(LinkedList<Integer> linkedList){
        Integer result = Linked_List_Random_Node.linked_List_Random_Node(linkedList);

        System.out.println("Given: " + PrintArrayOrList.listToString(linkedList));
        System.out.println("Result: " + result.toString());
    }
}
