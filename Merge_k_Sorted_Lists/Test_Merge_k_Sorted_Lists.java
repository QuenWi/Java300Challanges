package Merge_k_Sorted_Lists;

import Helpers.PrintArrayOrList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_Merge_k_Sorted_Lists {

    public static void main(String[] args) {
        List<List<Double>> lists = new ArrayList<>();
        Arrays.asList();
        Double[][] array = new Double[][]{
                {1d, 2d, 3d, 16d, 17d, 18d},
                {2d, 3d, 4d, 18d, 19d, 20d},
                {7d, 8d, 12d, 14d},
                {3d}
        };
        lists.add(Arrays.asList(array[0]));
        lists.add(Arrays.asList(array[1]));
        lists.add(Arrays.asList(array[2]));
        lists.add(Arrays.asList(array[3]));
        test(lists);
    }

    private static void test(List<List<Double>> lists){
        List<Double> result = Merge_k_Sorted_Lists.merge_k_Sorted_Lists(lists);

        System.out.println("Given: " + PrintArrayOrList.listMatrixToString(lists));
        System.out.println("Result: " + PrintArrayOrList.listToString(result));
    }
}
