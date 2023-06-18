package Summary_Ranges;

import Helpers.Interval;
import Helpers.PrintArrayOrList;

import java.util.List;

public class Test_Summary_Ranges {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 6, 9, 10, 11, 13, 14, 16, 20};
        List<Interval<Integer>> list = Summary_Ranges.summary_Ranges(array);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Result: " + Interval.listToString(list));

    }
}
