package Longest_Substring_Without_Repeating_Characters;

import java.util.HashMap;

public class Longest_Substring_Without_Repeating_Characters {

    //What is the length of the longest substring without any repeating character?
    public static Integer longest_Substring_Without_Repeating_Character(String string){
        Integer result = 0;
        char[] array = string.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            hashMap = new HashMap<>();
            hashMap.put(array[i], i);
            i++;
            while(i < array.length && !hashMap.containsKey(array[i])){
                hashMap.put(array[i], i);
                i++;
            }
            if(hashMap.size() > result){
                result = hashMap.size();
            }
            if(i < array.length){
                i = hashMap.get(array[i]) + 1;
            }
        }
        if(hashMap.size() > result){
            result = hashMap.size();
        }
        return result;
    }
}
