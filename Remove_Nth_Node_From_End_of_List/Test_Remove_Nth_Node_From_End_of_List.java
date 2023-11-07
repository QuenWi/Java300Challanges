package Remove_Nth_Node_From_End_of_List;

import Helpers.PrintArrayOrList;
import Remove_Duplicates_from_Sorted_List_II.Remove_Duplicates_from_Sorted_List_II;

import java.util.ArrayList;
import java.util.List;

public class Test_Remove_Nth_Node_From_End_of_List {

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>(){{
            add(1d); add(1.1d); add(1.1d); add(1.1d);; add(1.5d); add(1.6d); add(1.8d); add(1.9d); add(1.9d); add(1.9d);
        }};
        test(list, 3);
    }

    private static void test(List<Double> list, Integer nr){
        System.out.println("Given: " + PrintArrayOrList.listToString(list));
        Remove_Nth_Node_From_End_of_List.remove_Nth_Node_From_End_of_List(list, nr);
        System.out.println("Result: " + PrintArrayOrList.listToString(list));
    }
}
