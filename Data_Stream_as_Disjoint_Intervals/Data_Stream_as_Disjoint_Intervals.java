package Data_Stream_as_Disjoint_Intervals;

import Helpers.Interval;
import Helpers.Interval_Sort;

import java.util.LinkedList;

public class Data_Stream_as_Disjoint_Intervals {
    private LinkedList<Interval<Integer>> linkedList = new LinkedList<Interval<Integer>>();

    public void add(Integer add){
        boolean added = false;
        for(int i = 0; i < linkedList.size(); i++){
            if(linkedList.get(i).includes(add)){
                added = true;
                break;
            }
            if(linkedList.get(i).getBottomLimit() > add){
                if(linkedList.get(i).getBottomLimit() == add+1){
                    linkedList.get(i).setBottomLimit(add);
                } else{
                    linkedList.add(new Interval<Integer>(add, add));
                    linkedList.sort(new Interval_Sort());
                }
                added = true;
                break;
            } else if(linkedList.get(i).getTopLimit() + 1 == add){
                if(i + 1 < linkedList.size()){
                    if(linkedList.get(i+1).getBottomLimit()-1 == add){
                        linkedList.add(new Interval<Integer>(linkedList.get(i).getBottomLimit(), linkedList.get(i+1).getTopLimit()));
                        linkedList.remove(i+1);
                        linkedList.remove(i);
                        linkedList.sort(new Interval_Sort());
                    } else{
                        linkedList.get(i).setTopLimit(add);
                    }
                } else{
                    linkedList.get(i).setTopLimit(add);
                }
                added = true;
                break;
            }
        }
        if(!added){
            linkedList.add(new Interval<Integer>(add, add));
        }
    }

    @Override
    public String toString(){
        return Interval.listToString(linkedList);
    }
}
