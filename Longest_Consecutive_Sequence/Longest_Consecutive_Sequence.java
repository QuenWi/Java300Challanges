package Longest_Consecutive_Sequence;

import java.util.HashSet;

public class Longest_Consecutive_Sequence {

    //How many elements are maximum continues in value inside this array?
    public static Integer longest_Consecutive_Sequence(Integer[] array){
        Integer result = 0;
        Integer memory = 0;
        int step;
        HashSet<Integer> hashSet = new HashSet<Integer>();
        HashSet<Integer> blacklist = new HashSet<Integer>();
        for(Integer i : array){
            hashSet.add(i);
        }
        for(Integer i : hashSet){
            if(!blacklist.contains(i)){
                memory = 1;
                step = 1;
                while(hashSet.contains(i + step)){
                    blacklist.add(i+step);
                    step++;
                    memory++;
                }
                step = 1;
                while(hashSet.contains(i - step)){
                    blacklist.add(i-step);
                    step++;
                    memory++;
                }
                if(memory > result){
                    result = memory;
                }
                blacklist.add(i);
            }
        }
        return result;
    }
}
