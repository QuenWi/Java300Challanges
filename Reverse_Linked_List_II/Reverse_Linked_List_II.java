package Reverse_Linked_List_II;

import java.util.List;

public class Reverse_Linked_List_II {

    //Reverse all elements from n to m.
    public static <T> void reverse_Linked_List_II(List<T> list, Integer from, Integer to){
        while(from < to){
            T step = list.get(from);
            list.set(from, list.get(to));
            list.set(to, step);
            from++;
            to--;
        }
    }
}
