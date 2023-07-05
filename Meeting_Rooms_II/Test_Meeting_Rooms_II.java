package Meeting_Rooms_II;

import Helpers.Interval;
import Helpers.Interval_Sort;

import java.util.ArrayList;
import java.util.List;

public class Test_Meeting_Rooms_II {

    public static void main(String[] args) {
        List<Interval<Double>> list = new ArrayList<>();
        list.add(new Interval<Double>(3.6d, 4d));
        list.add(new Interval<Double>(2.1d, 3d));
        list.add(new Interval<Double>(3.7d, 5d));
        list.add(new Interval<Double>(2.6d, 3.2d));
        list.add(new Interval<Double>(3.1d, 3.4d));
        list.add(new Interval<Double>(0d, 2d));
        list.add(new Interval<Double>(3.5d, 4.5d));
        list.add(new Interval<Double>(2.9d, 4.1d));
        list.add(new Interval<Double>(2.2d, 2.3d));
        list.add(new Interval<Double>(1.3d,  1.8d));
        test(list);
        list.add(new Interval<Double>(3.4d, 4d));
        test(list);
        list.sort(new Interval_Sort());
        System.out.println(Interval.listToString(list));
    }

    private static void test(List<Interval<Double>> list){
        Integer result = Meeting_Rooms_II.meeting_Rooms_II(list);

        System.out.println("Given: " + Interval.listToString(list));
        System.out.println("Result: " + result.toString());
    }
}
