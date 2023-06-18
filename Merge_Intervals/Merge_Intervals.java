package Merge_Intervals;

import Helpers.Interval;
import Helpers.Interval_Sort;

import java.util.ArrayList;
import java.util.List;

public class Merge_Intervals {

    //Merges intervals in a List together. The output is a new list. The input list not getting changed
    public static <T extends Number> List<Interval<T>> merge_Intervals(List<Interval<T>> list2){
        if(list2 == null){
            return null;
        }
        List <Interval<T>> list = Interval.copyIntervalList(list2);
        List<Interval<T>> result = new ArrayList<Interval<T>>();
        list.sort(new Interval_Sort());
        Interval<T> memory = list.get(0);

        for(int i = 1; i < list.size(); i++){
            if(memory.includes(list.get(i))){
                if(memory.getTopLimit().floatValue() < list.get(i).getTopLimit().floatValue()){
                    memory.setTopLimit(list.get(i).getTopLimit());
                }
            } else{
                result.add(new Interval<T>(memory.getBottomLimit(), memory.getTopLimit()));
                memory.setBottomLimit(list.get(i).getBottomLimit());
                memory.setTopLimit(list.get(i).getTopLimit());
            }
        }

        result.add(new Interval<T>(memory.getBottomLimit(), memory.getTopLimit()));

        return result;
    }
}
