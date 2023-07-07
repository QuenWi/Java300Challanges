package Contains_Duplicate;

import java.util.HashSet;

public class Contains_Duplicate {

    //Does an Array contain duplicates?
    public static <T> Boolean contains_Duplicate(T[] array){
        HashSet<T> hashSet = new HashSet<>();
        for(T item : array){
            if(hashSet.contains(item)){
                return true;
            }
            hashSet.add(item);
        }
        return false;
    }
}
