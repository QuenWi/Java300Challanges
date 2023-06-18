package Insert_Interval;

import Helpers.Interval;
import Helpers.Interval_Sort;

import java.util.ArrayList;
import java.util.List;

public class Test_Insert_Interval {
    public static void main(String[] args) {
        List<Interval<Double>> list = new ArrayList<Interval<Double>>();
        list.add(new Interval<Double>(0d, 1d));
        list.add(new Interval<Double>(2.2d, 2.4d));
        list.add(new Interval<Double>(3.2d, 3.5d));
        list.add(new Interval<Double>(3.8d, 4d));
        list.add(new Interval<Double>(5d, 6d));
        list.add(new Interval<Double>(6.5d, 6.9d));
        list.add(new Interval<Double>(7d, 9.5d));
        list.add(new Interval<Double>(10d, 10.5d));
        list.add(new Interval<Double>(11d, 12d));
        list.sort(new Interval_Sort());
        Interval<Double> interval = new Interval<Double>(4d, 9d);
        //Interval<Double> interval = new Interval<Double>(0d, 12d); //Test 2
        //Interval<Double> interval = new Interval<Double>(20d, 100d); //Test 3
        List<Interval<Double>> result = Insert_Interval.insert_Intervals(list, interval);

        System.out.println("Given: " + Interval.listToString(list));
        System.out.println("Insert: " + interval.toString());
        System.out.println("Result: " + Interval.listToString(result));

    }
}
