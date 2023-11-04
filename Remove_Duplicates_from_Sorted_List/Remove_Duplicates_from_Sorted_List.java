package Remove_Duplicates_from_Sorted_List;

import java.util.List;

public class Remove_Duplicates_from_Sorted_List {

    //remove all duplicates from a sorted list
    public static <T> void remove_Duplicates_from_Sorted_List(List<T> list){
        for(int i = 0; i < list.size()-1; i++){
            if(list.get(i).equals(list.get(i+1))){
                T element = list.get(i);
                while(i+1 < list.size() && list.get(i+1).equals(element)){
                    list.remove(i+1);
                }
                list.remove(i);
            }
        }
    }
}
