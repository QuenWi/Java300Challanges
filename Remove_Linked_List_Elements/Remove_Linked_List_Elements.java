package Remove_Linked_List_Elements;

import java.util.List;

public class Remove_Linked_List_Elements {

    //Remove all variables equal to k from the list
    public static <T> void remove_Linked_List_Elements(List<T> list, T element){
        int lenght = list.size(), index = 0;
        for(int i = 0; i < lenght; i++){
            if(element.equals(list.get(index))){
                list.remove(index);
            } else{
                index++;
            }
        }
    }
}
