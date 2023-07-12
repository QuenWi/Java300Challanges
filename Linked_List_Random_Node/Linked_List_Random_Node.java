package Linked_List_Random_Node;

import java.util.LinkedList;
import java.util.Random;

public class Linked_List_Random_Node {

    //Get a random node from a linked list
    public static <T> T linked_List_Random_Node(LinkedList<T> linkedList){
        T result;
        Random random = new Random();
        int number = random.nextInt(linkedList.size());
        result = linkedList.get(number);
        return result;
    }
}
