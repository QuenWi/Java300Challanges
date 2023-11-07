package Remove_Nth_Node_From_End_of_List;

import java.util.List;

public class Remove_Nth_Node_From_End_of_List {

    //Remove the kth last node.
    public static <T> void remove_Nth_Node_From_End_of_List(List<T> list, int nr){
        list.remove(list.size() - 1 - nr);
    }
}
