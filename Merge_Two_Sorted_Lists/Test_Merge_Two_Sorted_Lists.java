package Merge_Two_Sorted_Lists;

import Helpers.PrintArrayOrList;

import java.util.ArrayList;
import java.util.List;

public class Test_Merge_Two_Sorted_Lists {

    public static void main(String[] args) {
        List<Float> list1 = new ArrayList<>(){{
            add(1f); add(4f); add(5f); add(8f); add(10f); add(11f);
        }};
        List<Float> list2 = new ArrayList<>(){{
            add(2f); add(6f); add(9f); add(9.9f);
        }};
        test(list1, list2);
    }

    private static void test(List<Float> list1, List<Float> list2){
        List<Float> result = Merge_Two_Sorted_Lists.merge_Two_Sorted_Lists(list1, list2);

        System.out.println("Given: " + PrintArrayOrList.listToString(list1) + "and" + PrintArrayOrList.listToString(list2));
        System.out.println("Result: " + PrintArrayOrList.listToString(result));
    }
}
