package Rearrange_String_k_Distance_Apart;

import java.util.HashMap;

public class Rearrange_String_k_Distance_Apart {

    //Rearange a string, such that all characters have a certain distance to themself
    public static String rearrange_String_k_Distance_Apart(String string, Integer distance){
        char[] array = string.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char c : array){
            if(!hashMap.containsKey(c)){
                hashMap.put(c, 1);
            } else{
                hashMap.put(c, hashMap.get(c)+1);
            }
        }
        int max = -1;
        int newMax;
        int start = 0;
        int counter;
        Character[] result = new Character[array.length];
        while(true){
            newMax = -1;
            for(Character c : hashMap.keySet()){
                if((max > hashMap.get(c) || max == -1) && hashMap.get(c) > newMax){
                    newMax = hashMap.get(c);
                }
            }
            if(newMax == -1){
                break;
            }
            max = newMax;
            for(Character c : hashMap.keySet()){
                if(max == hashMap.get(c)){
                    counter = 0;
                    while(result[start+counter] != null){
                        counter++;
                    }
                    for(int i = 0; i < max; i++){
                        if(start + counter + (distance+1)*i < result.length){
                            result[start + counter + (distance+1)*i] = c;
                        } else{
                            return "";
                        }
                    }
                    start++;
                }
            }
        }
        for(int i = 0; i < array.length; i++){
             array[i] = result[i];
        }
        return String.copyValueOf(array);
    }
}
