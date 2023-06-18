package Summary_Ranges;

import Helpers.Interval;

import java.util.ArrayList;
import java.util.List;

public class Summary_Ranges {

    //Makes an sorted Integer-List into an Integral<Integer>-List, which coveres the same numbers.
    public static List<Interval<Integer>> summary_Ranges(Integer[] array){
        List<Interval<Integer>> result = new ArrayList<Interval<Integer>>();
        boolean first = true;
        Interval<Integer> prepare = new Interval<Integer>(array[0], array[0]);
        for(Integer i : array){
            if(first){
                first = false;
            } else{
                if(i.intValue() - 1 != prepare.getTopLimit().intValue()){
                    result.add(new Interval<Integer>(prepare.getBottomLimit(), prepare.getTopLimit()));
                    prepare.setTopLimit(i);
                    prepare.setBottomLimit(i);
                } else{
                    prepare.setTopLimit(i);
                }
            }
        }
        result.add(new Interval<Integer>(prepare.getBottomLimit(), prepare.getTopLimit()));

        return result;
    }
}
