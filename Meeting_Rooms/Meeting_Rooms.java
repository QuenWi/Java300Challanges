package Meeting_Rooms;

import Helpers.Interval;
import Helpers.Interval_Sort;

import java.util.ArrayList;
import java.util.List;

public class Meeting_Rooms {

    //is it possible for a person to be in all meetings?
    public static <T extends Number> Boolean meeting_Rooms(List<Interval<T>> list){
        List<Interval<T>> sortedList = new ArrayList<>();
        for(Interval<T> item : list){
            sortedList.add(item);
        }
        sortedList.sort(new Interval_Sort());
        for(int i = 1; i < sortedList.size(); i++){
            if(sortedList.get(i-1).includes(sortedList.get(i))){
                return false;
            }
        }
        return true;
    }
}
