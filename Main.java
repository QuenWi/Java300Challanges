import Helpers.Interval;
import Helpers.Interval_Sort;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Interval<Integer>> list = new ArrayList<Interval<Integer>>();
        list.add(new Interval<Integer>(11, 2));
        list.add(new Interval<Integer>(2, 4));
        list.add(new Interval<Integer>(20, 5));
        list.add(new Interval<Integer>(10, 8));
        list.add(new Interval<Integer>(13, 7));
        System.out.println(list.toString());
        list.sort(new Interval_Sort());
        System.out.println(list.toString());
    }
}