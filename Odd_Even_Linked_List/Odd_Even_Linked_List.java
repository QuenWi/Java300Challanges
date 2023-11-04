package Odd_Even_Linked_List;

import java.util.List;

public class Odd_Even_Linked_List {

    //Reorder a list. First all elements with even indexes, followed by all with uneven indexes.
    public static <T> void odd_Even_Linked_List(List<T> list){
        for(int i = 1; i < list.size()/2+1; i++){
            list.add(list.get(i));
            list.remove(i);
        }
    }
}
