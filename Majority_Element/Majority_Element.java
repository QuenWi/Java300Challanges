package Majority_Element;

import java.util.HashMap;

public class Majority_Element {

    //What element in the array is more than 50 of the elements inside the array?
    public static <T> T mafority_Element(T[] array){
        T result = null;
        Integer half = 0;
        if(array.length%2 == 0){
            half = array.length/2;
        } else{
            half = array.length/2+1;
        }
        HashMap<T, Integer> hashMap = new HashMap<>();
        for(T item : array){
            if(hashMap.containsKey(item)){
                hashMap.put(item, hashMap.get(item)+1);
            } else{
                hashMap.put(item, 1);
            }
            if(hashMap.get(item) >= half){
                return item;
            }
        }
        return result;
    }
}
