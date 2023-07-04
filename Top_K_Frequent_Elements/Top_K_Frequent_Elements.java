package Top_K_Frequent_Elements;

import Increasing_Triplet_Subsequence.Increasing_Triplet_Subsequence;

import java.lang.reflect.Array;
import java.util.HashMap;

public class Top_K_Frequent_Elements {

    //Which Elements appeare the most time?
    public static <T> T[] top_K_Frequent_Elements(T[] array, Integer k){
        T[] result = null;
        HashMap<T, Integer> hashMap = new HashMap<>();
        for(T item : array){
            if(hashMap.containsKey(item)){
                hashMap.put(item, hashMap.get(item) + 1);
            } else{
                hashMap.put(item, 1);
            }
        }
        int max = -1;
        int maxNeu;
        int maxCount;
        int counter = 0;
        if(hashMap.size() > k){
            while(k > counter){
                maxNeu = -1;
                maxCount = 1;
                for(Integer i : hashMap.values()){
                    if(i > maxNeu && (i < max || max == -1)){
                        maxNeu = i;
                        maxCount = 1;
                    } else if(i.equals(maxNeu)){
                        maxCount++;
                    }
                }
                counter += maxCount;
                max = maxNeu;
            }
            max = -1;
            result = (T[]) (Array.newInstance(array.getClass().getComponentType(), counter));
            while(counter > 0){
                maxNeu = -1;
                for(Integer i : hashMap.values()){
                    if(i > maxNeu && (i < max || max == -1)){
                        maxNeu = i;
                    }
                }
                max = maxNeu;
                for(T t : hashMap.keySet()){
                    if(hashMap.get(t) == max){
                        result[result.length-counter] = t;
                        counter--;
                    }
                }
            }
        } else{
            result = (T[]) (Array.newInstance(array.getClass().getComponentType(), hashMap.size()));
            counter = 0;
            while(counter < hashMap.size()){
                maxNeu = -1;
                for(Integer i : hashMap.values()){
                    if(i > maxNeu && (i < max || max == -1)){
                        maxNeu = i;
                    }
                }
                max = maxNeu;
                for(T t : hashMap.keySet()){
                    if(hashMap.get(t) == max){
                        result[counter] = t;
                        counter++;
                    }
                }
            }
        }

        return result;
    }
}
