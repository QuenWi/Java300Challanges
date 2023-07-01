package Longest_Substring_with_At_Least_K_Repeating_Characters;

import Helpers.PrintArrayOrList;

import java.lang.reflect.Array;
import java.util.*;

public class Longest_Substring_with_At_Least_K_Repeating_Characters {

    //
    public static String longest_Substring_with_At_Least_K_Repeating_Characters(String string, int min){
        String result = "";
        char[] array = string.toCharArray();
        HashMap<Character, ArrayList<Integer>> hashMap = new HashMap<>();
        for(int i = 0; i < string.length(); i++){
            if(hashMap.containsKey(array[i])){
                hashMap.get(array[i]).add(i);
            } else{
                ArrayList<Integer> arrayList = new ArrayList<Integer>();
                arrayList.add(i);
                hashMap.put(array[i], arrayList);
            }
        }
        HashSet<Character> blacklist = new HashSet<>(); //All places of characters, which are not often enought in the string
        for(Character c : hashMap.keySet()){
            if(hashMap.get(c).size() < min){
                blacklist.add(c);
            }
        }
        for(Character c : blacklist){
            hashMap.remove(c);
        }

        /* blacklist.sort(Integer::compareTo);
        for(Character c : hashMap.keySet()){
            System.out.println("HashMap " + c + ": " + PrintArrayOrList.listToString(hashMap.get(c).stream().toList()));
        }
        System.out.println("Blacklist: " + PrintArrayOrList.listToString(blacklist.stream().toList()));*/

        int maxLength = 0;
        int bottom;
        int top;
        int newTop;
        boolean breakUp;
        int offset;
        for(int i = 0; i < array.length; i++){
            Character c = array[i];
            if(!blacklist.contains(c)){
                for(int j = 0; j < hashMap.get(c).size()-min+1; j++){
                    bottom = hashMap.get(c).get(j);
                    top = hashMap.get(c).get(j+min-1);
                    breakUp = false;
                    while(!breakUp){
                        newTop = -1;
                        for(int k = bottom; k < top+1; k++){
                            if(blacklist.contains(array[k])){
                                breakUp = true;
                                break;
                            }
                            offset = 0;
                            while(hashMap.get(array[k]).get(offset) < bottom && offset < hashMap.get(array[k]).size()){
                                offset++;
                            }
                            for(int l = 0; l < min; l++){
                                if(l + offset >= hashMap.get(array[k]).size()){
                                    breakUp = true;
                                    break;
                                } else{
                                    //System.out.println(bottom + " "+ top + " " + hashMap.get(array[k]).get(l+offset) + " " + array[k] + " " + offset + " < " + hashMap.get(array[k]).size());
                                    if(top < hashMap.get(array[k]).get(l+offset) && newTop < hashMap.get(array[k]).get(l+offset)){
                                        newTop = hashMap.get(array[k]).get(l+offset);
                                    }
                                }
                            }
                        }
                        //System.out.println(c + " " + breakUp + " " + newTop + " " + bottom + " " + top + " ");
                        if(!breakUp && newTop != -1){
                            top = newTop;
                        }
                        else if(!breakUp && newTop == -1 && top-bottom > maxLength){
                            //System.out.println("NEW RESULT----------------------------------------------------------");
                            maxLength = top-bottom;
                            result = string.substring(bottom, top+1);
                            breakUp = true;
                        } else{
                            breakUp = true;
                        }
                    }
                }
                blacklist.add(c);
            }
        }
        return result;
    }
}
