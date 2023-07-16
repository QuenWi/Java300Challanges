package Group_Anagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Group_Anagrams {

    //Returns a List of all anagram Lists.
    public static List<List<String>> group_Anagrams(String[] array){
        List<List<String>> result = new ArrayList<>();
        List<WordId> list = new ArrayList<>();
        for(int i = 0; i < array.length; i++){
            list.add(new WordId(array[i]));
        }
        HashSet<List<WordId>> hashSet = new HashSet<>();
        for(int i = 0; i < list.size(); i++){
            boolean done = false;
            WordId wordId = list.get(i);
            for(List<WordId> list1 : hashSet){
                if(list1.get(0).equals(wordId)){
                    list1.add(wordId);
                    done = true;
                    break;
                }
            }
            if(!done){
                List<WordId> newList = new ArrayList<>();
                newList.add(wordId);
                hashSet.add(newList);
            }
        }
        for(List<WordId> list1 : hashSet){
            List<String> newList = new ArrayList<>();
            for(WordId wordId : list1){
                newList.add(wordId.string);
            }
            result.add(newList);
        }
        return result;
    }

    private static class WordId{
        String string;
        HashMap<Character, Integer> hashMap;

        WordId(String string){
            this.string = string;
            hashMap = new HashMap<>();
            char[] array = string.toLowerCase().toCharArray();
            for(int i = 0; i < array.length; i++){
                if(hashMap.containsKey(array[i])){
                    hashMap.put(array[i], hashMap.get(array[i]));
                } else{
                    hashMap.put(array[i], 1);
                }
            }
        }

        @Override
        public boolean equals(Object o1){
            WordId wordId = (WordId) o1;
            if(wordId.hashMap.size() != hashMap.size()){
                return false;
            }
            for(Character c : hashMap.keySet()){
                if(!wordId.hashMap.containsKey(c)){
                    return false;
                }
                if(hashMap.get(c) != wordId.hashMap.get(c)){
                    return false;
                }
            }
            return true;
        }
    }
}
