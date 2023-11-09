package Reverse_Nodes_in_kGroup;

import Helpers.PrintArrayOrList;

import java.util.List;

public class Reverse_Nodes_in_kGroup {

    //Reverse all kth sized groups inside a list
    public static <T> void reverse_Nodes_in_kGroup(List<T> list, Integer groupSize){
        for(int i = 0; i < list.size(); i+=groupSize){
            int topLimit = i + groupSize-1, bottomLimit = i;
            if(topLimit > list.size()-1){
                topLimit = list.size()-1;
            }
            while(bottomLimit < topLimit){
                T step = list.get(bottomLimit);
                list.set(bottomLimit, list.get(topLimit));
                list.set(topLimit, step);
                bottomLimit++;
                topLimit--;
            }
        }
    }
}
