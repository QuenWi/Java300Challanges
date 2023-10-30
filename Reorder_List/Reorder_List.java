package Reorder_List;

import Helpers.PrintArrayOrList;

import java.util.LinkedList;

public class Reorder_List {

    //Change the order of a linked list, without creating a new one. (1st, n, 2nd, n-1, 3rd, n-2, ...)
     public static <T> void reorder_List(LinkedList<T> list){
         boolean switcher = false;
         for(int i = list.size()-1; i >= 0; i--){
             if(switcher){
                 list.add(list.get(i));
                 list.remove(i);
             } else{
                list.add(list.get(0));
                list.remove(0);
             }
             switcher = !switcher;
         }
     }
}
