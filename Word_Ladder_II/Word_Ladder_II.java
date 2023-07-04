package Word_Ladder_II;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Word_Ladder_II {

    //Each word with only 1 character difference conects to another word. Which words you've to jump than,
    //to get from one word to another? (ABC - > ABD -> AED - > FED = [ABC, ABD, AED, FED])
    public static String[] word_Ladder_II(String[] array, String start, String end){
        HashSet<String> list = new HashSet<>(Arrays.stream(array).toList());
        list.add(end);
        //dykestar
        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
        hashMap.put(start, new ArrayList<String>());
        hashMap.get(start).add(start);
        HashMap<String, ArrayList<String>> newHashMap;
        do{
            newHashMap = new HashMap<>();
            for(String s1 : hashMap.keySet()){
                for(String s2 : list){
                    if(one_Edit_Distance(s1, s2)){
                        ArrayList<String> memory;
                        memory = hashMap.get(s1);
                        memory.add(s2);
                        if(end.equals(s2)){
                            String[] result = new String[memory.size()];
                            result = memory.toArray(result);
                            return result;
                        }
                        newHashMap.put(s2, memory);
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
        return null;
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
