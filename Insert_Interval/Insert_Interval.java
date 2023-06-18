package Insert_Interval;

import Helpers.Interval;
import Helpers.Interval_Sort;

import java.util.ArrayList;
import java.util.List;

public class Insert_Interval {

    //Given is a sorted list of non overlapping Intevals and another interval.
    //It outputs a new list of intervals which suits the list plus the new one (it meight merge intevals together).
    public static <T extends Number> List<Interval<T>> insert_Intervals(List<Interval<T>> list, Interval<T> interval){
        List<Interval<T>> result = new ArrayList<Interval<T>>();
        Interval<T> memory = new Interval<T>(interval.getBottomLimit(), interval.getTopLimit());
        for(int i = 0; i < list.size(); i++){
            if(interval.includes(list.get(i))){
                if(list.get(i).getBottomLimit().floatValue() < interval.getBottomLimit().floatValue()){
                    memory.setBottomLimit(list.get(i).getBottomLimit());
                }
                if(list.get(i).getTopLimit().floatValue() > interval.getTopLimit().floatValue()){
                    memory.setTopLimit(list.get(i).getTopLimit());
                }
            }
            else{
                result.add(new Interval<T>(list.get(i).getBottomLimit(), list.get(i).getTopLimit()));
            }
        }
        result.add(memory);
        result.sort(new Interval_Sort());
        return result;
    }

}
