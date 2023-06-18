package Missing_Ranges;

import Helpers.Interval;

import java.util.ArrayList;
import java.util.List;

public class Missing_Ranges {

    //Gets all the missing Parts from a sorted Integer-List. It goes from 0 to max.
    public static List<Interval<Integer>> missing_Ranges(Integer[] array, int min, int max){
        List<Interval<Integer>> result = new ArrayList<Interval<Integer>>();
        Interval<Integer> memory = new Interval<Integer>(min, min);
        for(int i : array){
            if(i - 1 > memory.getTopLimit().intValue()){
                result.add(new Interval<Integer>(memory.getBottomLimit(), i - 1));
                memory.setTopLimit(i);
                memory.setBottomLimit(i+1);
            } else{
                memory.setTopLimit(i);
                memory.setBottomLimit(i+1);
            }
        }
        if(memory.getTopLimit().intValue() != max){
            result.add(new Interval<Integer>(memory.getBottomLimit(), max));
        }

        return result;
    }
}
