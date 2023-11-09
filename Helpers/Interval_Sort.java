package Helpers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Interval_Sort implements Comparator<Interval> {
    @Override
    public int compare(Interval o1, Interval o2) {
        if(o1.getBottomLimit().floatValue() > o2.getBottomLimit().floatValue()){
            return 1;
        } else if(o1.getBottomLimit().floatValue() < o2.getBottomLimit().floatValue()) {
            return -1;
        } else {
            if(o1.getTopLimit().floatValue() > o2.getTopLimit().floatValue()){
                return 1;
            } else if(o1.getTopLimit().floatValue() < o2.getTopLimit().floatValue()){
                return -1;
            }
            return 0;
        } //more precise than return o2.getBottomLimit.intValue() - o1.getBottomLimit.intValue();
    }

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
