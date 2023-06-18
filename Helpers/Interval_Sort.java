package Helpers;

import java.util.Comparator;

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
}
