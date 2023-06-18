package Missing_Ranges;

import Helpers.Interval;
import Helpers.PrintArrayOrList;

import java.util.List;

public class Test_Missing_Ranges {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 6, 9, 10, 11, 13, 14, 16, 20};
        int max = 22;
        int min = -2;
        List<Interval<Integer>> list = Missing_Ranges.missing_Ranges(array, min, max);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Result: " + Interval.listToString(list));

    }
}
