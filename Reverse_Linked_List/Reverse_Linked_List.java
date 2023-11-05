package Reverse_Linked_List;

import java.util.LinkedList;

public class Reverse_Linked_List {

    //Reverse a linkedList
    public static <T> void reverse_Linked_List(LinkedList<T> list){
        int lenght = list.size();
        for(int i = 1; i < lenght; i++){
            list.addFirst(list.get(i));
            list.remove(i+1);
        }
    }
}
