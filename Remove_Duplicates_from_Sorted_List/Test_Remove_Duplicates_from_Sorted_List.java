package Remove_Duplicates_from_Sorted_List;

import Helpers.PrintArrayOrList;

import java.util.ArrayList;
import java.util.List;

public class Test_Remove_Duplicates_from_Sorted_List {

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>(){{
            add(1d); add(1.1d); add(1.1d); add(1.1d);; add(1.5d); add(1.6d); add(1.8d); add(1.9d); add(1.9d); add(1.9d);
        }};
        test(list);
    }

    private static void test(List<Double> list){
        System.out.println("Given: " + PrintArrayOrList.listToString(list));
        Remove_Duplicates_from_Sorted_List.remove_Duplicates_from_Sorted_List(list);
        System.out.println("Result: " + PrintArrayOrList.listToString(list));
    }
}
