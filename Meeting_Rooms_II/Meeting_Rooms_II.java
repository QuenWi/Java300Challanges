package Meeting_Rooms_II;

import Helpers.Interval;
import Helpers.Interval_Sort;

import java.util.ArrayList;
import java.util.List;

public class Meeting_Rooms_II {

    //How many rooms do you need, in order to be able to run all meetings?
    public static <T extends Number> Integer meeting_Rooms_II(List<Interval<T>> list){
        Integer result = 0;
        List<List<Interval<T>>> allPosibilities = new ArrayList<>();
        List<List<Interval<T>>> allPosibilitiesAddAfter = new ArrayList<>();
        boolean include;
        for(int i = 0; i < list.size(); i++){
            allPosibilitiesAddAfter = new ArrayList<>();
            for(List<Interval<T>> list1 : allPosibilities){
                include = true;
                for(Interval<T> item : list1){
                    if(!item.includes(list.get(i))){
                        include = false;
                        break;
                    }
                }
                if(include){
                    List<Interval<T>> newList = new ArrayList<>();
                    for(Interval<T> item : list1){
                        newList.add(item);
                    }
                    newList.add(list.get(i));
                    allPosibilitiesAddAfter.add(newList);
                }
            }
            for(List<Interval<T>> item : allPosibilitiesAddAfter){
                allPosibilities.add(item);
            }
            List<Interval<T>> newList = new ArrayList<>();
            newList.add(list.get(i));
            allPosibilities.add(newList);
        }
        for(List<Interval<T>> item : allPosibilities){
            //System.out.println(Interval.listToString(item));
            if(item.size() > result){
                result = item.size();
            }
        }
        return result;
    }
}
