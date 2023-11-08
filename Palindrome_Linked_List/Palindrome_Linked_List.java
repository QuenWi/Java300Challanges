package Palindrome_Linked_List;

import java.util.LinkedList;

public class Palindrome_Linked_List {

    //Determins, if list is a palindrome.
    public static <T> Boolean palindrom_Linked_List(LinkedList<T> list){
        for(int i = 0, j = list.size()-1; i < j; i++, j--){
            if(!list.get(i).equals(list.get(j))){
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }
}
