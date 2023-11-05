package Partition_List;

import Helpers.PrintArrayOrList;

import java.util.ArrayList;
import java.util.List;

public class Test_Partition_List {

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>(){{
           add(0d); add(2d); add(7d); add(3d); add(7d); add(8d); add(1d); add(5d); add(4d); add(2.2d);
        }};
        test(list, 3.14d);
    }

    private static void test(List<Double> list, Double number){
        System.out.println("Given: " + PrintArrayOrList.listToString(list) + " and " + number.toString());
        Partition_List.partition_List(list, number);
        System.out.println("Result: " + PrintArrayOrList.listToString(list));
    }
}
