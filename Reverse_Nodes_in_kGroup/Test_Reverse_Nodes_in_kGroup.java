package Reverse_Nodes_in_kGroup;

import Helpers.PrintArrayOrList;

import java.util.ArrayList;
import java.util.List;

public class Test_Reverse_Nodes_in_kGroup {

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>(){{
            add(1d); add(2d); add(3d); add(4d); add(5d); add(6d); add(7d); add(8d); add(9d); add(10d); add(11d);
        }};
        test(list, 2);
        list = new ArrayList<>(){{
            add(1d); add(2d); add(3d); add(4d); add(5d); add(6d); add(7d); add(8d); add(9d); add(10d); add(11d);
        }};
        test(list, 3);
    }

    private static void test(List<Double> list, Integer nr){
        System.out.println("Given: " + PrintArrayOrList.listToString(list) + " and " + nr.toString());
        Reverse_Nodes_in_kGroup.reverse_Nodes_in_kGroup(list, nr);
        System.out.println("Result: " + PrintArrayOrList.listToString(list) + " and " + nr.toString());
    }
}
