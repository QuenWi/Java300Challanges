package Missing_Ranges;

import Helpers.Interval;
import Helpers.PrintArrayOrList;

import java.util.List;

public class Test_Missing_Ranges {
    public static void main(String[] args) {
        test(new Integer[] {1, 2, 3, 4, 6, 9, 10, 11, 13, 14, 16, 20}, 22, -2);
    }

    private static void test(Integer[] array, int max, int min){
        List<Interval<Integer>> list = Missing_Ranges.missing_Ranges(array, min, max);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Result: " + Interval.listToString(list));
    }
}
