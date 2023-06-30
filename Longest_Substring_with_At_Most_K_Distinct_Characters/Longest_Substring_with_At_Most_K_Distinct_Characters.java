package Longest_Substring_with_At_Most_K_Distinct_Characters;

import java.util.ArrayList;
import java.util.HashMap;

public class Longest_Substring_with_At_Most_K_Distinct_Characters {

    //what is the longest substring with at most k distinct characters
    public static Integer longest_Substring_with_At_Most_K_Distinct_Characters(String string, Integer k){
        Integer result = 0;
        Integer memory = 0;
        if(k < 1){
            return 0;
        }
        ArrayList<Character> taken = new ArrayList<Character>();
        ArrayList<Integer> positions = new ArrayList<Integer>();
        char[] array = string.toCharArray();
        for(int i = 0; i < array.length; i++){
            if(taken.contains(array[i])){
                positions.set(taken.indexOf(array[i]), i);
            } else{
                if(taken.size() == k){
                    Integer newI = -1;
                    for(int j = 0; j < positions.size(); j++){
                        if(newI == -1){
                            newI = positions.get(j);
                        } else if(newI > positions.get(j)){
                            newI = positions.get(j);
                        }
                    }
                    if(result < i - memory){
                        result = i - memory;
                    }
                    newI++;
                    i = newI;
                    memory = newI;
                    taken = new ArrayList<Character>();
                    positions = new ArrayList<Integer>();
                } else{
                    taken.add(array[i]);
                    positions.add(i);
                }
            }
        }
        if(result < array.length - memory){
            result = array.length - memory;
        }
        return result;
    }
}
