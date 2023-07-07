package Contains_Duplicate_II;

import java.util.HashMap;

public class Contains_Duplicate_II {

    //Does the Array has a Duplicate, excapt dublicates have a distance k from eachother.
    public static <T> Boolean contains_Duplicate_II(T[] array, Integer distance){
        HashMap<T, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            if(hashMap.containsKey(array[i])){
                if(i - distance == hashMap.get(array[i])){
                    hashMap.put(array[i], i);
                } else{
                    return true;
                }
            } else{
                hashMap.put(array[i], i);
            }
        }
        return false;
    }
}
