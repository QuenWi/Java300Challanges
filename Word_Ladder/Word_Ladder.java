package Word_Ladder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Word_Ladder {

    //Each word with only 1 character difference conects to another word. How many words you've to jump than,
    //to get from one word to another? (ABC - > ABD -> AED - > FED = 4)
    public static Integer word_Ladder(String[] array, String start, String end){
        Integer result = null;
        ArrayList<String> list = new ArrayList<>(Arrays.stream(array).toList());
        list.add(end);
        //dykestar
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put(start, 0);
        HashMap<String, Integer> newHashMap;
        do{
            newHashMap = new HashMap<>();
            for(String s1 : hashMap.keySet()){
                for(String s2 : list){
                    if(one_Edit_Distance(s1, s2)){
                        if(end.equals(s2)){
                            return hashMap.get(s1)+1;
                        }
                        newHashMap.put(s2, hashMap.get(s1)+1);
                    }
                }
            }
            hashMap = newHashMap;
            for(String s : newHashMap.keySet()){
                if(list.contains(s)){
                    list.remove(s);
                }
            }
        } while(newHashMap.size() != 0);
        return -1;
    }

    private static boolean one_Edit_Distance(String string1, String string2){
        char[] array1 = string1.toCharArray();
        char[] array2 = string2.toCharArray();
        int counter = 0;
        if(Math.abs(array1.length - array2.length) > 1){
            return false;
        }
        while(counter < array1.length && counter < array2.length && array1[counter] == array2[counter])
        {
            counter++;
        }
        if(array1.length == array2.length){
            counter++;
            while(counter < array1.length && counter < array2.length && array1[counter] == array2[counter])
            {
                counter++;
            }
            if(array1.length != counter){
                return false;
            }
        } else{
            if(array1.length > array2.length){
                while(counter < array2.length && array1[counter+1] == array2[counter])
                {
                    counter++;
                }
                if(array2.length != counter){
                    return false;
                }
            } else{
                while(counter < array1.length && array1[counter] == array2[counter+1])
                {
                    counter++;
                }
                if(array1.length != counter){
                    return false;
                }
            }
        }
        return true;
    }
}
