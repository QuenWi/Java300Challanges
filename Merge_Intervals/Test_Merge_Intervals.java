package Merge_Intervals;

import Helpers.Interval;
import Helpers.Interval_Sort;

import java.util.List;
import java.util.ArrayList;

public class Test_Merge_Intervals {
    public static void main(String[] args) {
        List<Interval<Float>> list = new ArrayList<Interval<Float>>();
        list.add(new Interval<Float>(0f, 2.2f));
        list.add(new Interval<Float>(5.8f, 6.1f));
        list.add(new Interval<Float>(5f, 5f));
        list.add(new Interval<Float>(8f, 8f));
        list.add(new Interval<Float>(3f, 4.2f));
        list.add(new Interval<Float>(4f, 4.5f));
        list.add(new Interval<Float>(4.2f, 4.2f));
        list.add(new Interval<Float>(4.6f, 5f));
        list.add(new Interval<Float>(4.8f, 5.1f));

        test(list);
    }

    private static void test(List<Interval<Float>> list){
        List<Interval<Float>> result = Merge_Intervals.merge_Intervals(list);

        System.out.println("List: " + Interval.listToString(list));
        list.sort(new Interval_Sort());
        System.out.println("Sorted-List: " + Interval.listToString(list));
        System.out.println("Result: " + Interval.listToString(result));
    }

}
