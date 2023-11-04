package Remove_Duplicates_from_Sorted_List_II;

import Helpers.PrintArrayOrList;
import Remove_Duplicates_from_Sorted_List.Remove_Duplicates_from_Sorted_List;

import java.util.ArrayList;
import java.util.List;

public class Test_Remove_Duplicates_from_Sorted_List_II {

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>(){{
            add(1d); add(1.1d); add(1.1d); add(1.1d);; add(1.5d); add(1.6d); add(1.8d); add(1.9d); add(1.9d); add(1.9d);
        }};
        test(list);
    }

    private static void test(List<Double> list){
        System.out.println("Given: " + PrintArrayOrList.listToString(list));
        Remove_Duplicates_from_Sorted_List_II.remove_Duplicates_from_Sorted_List_II(list);
        System.out.println("Result: " + PrintArrayOrList.listToString(list));
    }
}
