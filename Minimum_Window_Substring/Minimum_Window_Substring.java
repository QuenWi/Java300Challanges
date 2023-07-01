package Minimum_Window_Substring;

import Helpers.PrintArrayOrList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Minimum_Window_Substring {

    //What is the smallest subarray, which includes all the characters from the second array
    public static String minimum_Window_Substring(String string1, String string2){
        String result = "";
        HashMap<Character, ArrayList<Integer>> hashMap = new HashMap<Character, ArrayList<Integer>>();
        char[] array1 = string1.toCharArray();
        char[] array2 = string2.toCharArray();
        for(char c : array2){
            if(!hashMap.containsKey(c)){
                hashMap.put(c, new ArrayList<Integer>());
            }
        }
        for(int i = 0; i < array1.length; i++){
            if(hashMap.containsKey(array1[i])){
                hashMap.get(array1[i]).add(i);
            }
        }
        /*for(Character c : hashMap.keySet()){
            System.out.println(c + ": " + PrintArrayOrList.listToString(hashMap.get(c)));
        }*/

        //Setup
        int min = -1;
        int max = -1;
        int smallestSize;
        HashMap<ArrayList<Integer>, Integer> positions = new HashMap<>();
        for(ArrayList<Integer> al : hashMap.values()){
            if(al.size() == 0){
                return "";
            }
            positions.put(al, 0);
            if(min == -1){
                min = al.get(0);
                max = al.get(0);

            } else{
                if(min > al.get(0)){
                    min = al.get(0);
                } else if(max < al.get(0)){
                    max = al.get(0);
                }
            }
        }
        smallestSize = max - min;
        result = string1.substring(min, max+1);

        /*for(ArrayList<Integer> i : positions.keySet()){
            System.out.println(positions.get(i) + " " + PrintArrayOrList.listToString(i));
        }
        System.out.println("min: " + min + ", max: " + max);*/

        int minMove;
        ArrayList<Integer> key;
        while(true){
            minMove = -1;
            key = null;
            //get smallest element
            for(ArrayList<Integer> al : positions.keySet()){
                if(al.size() > positions.get(al) + 1){
                    if(minMove == -1){
                        minMove = al.get(positions.get(al));
                        key = al;
                    } else if(minMove > al.get(positions.get(al))){
                        minMove = al.get(positions.get(al));
                        key = al;
                    }
                }
            }
            if(minMove == -1){
                break;
            }
            //Change hashmap + max(if needed)
            if(key.get(positions.get(key)+1) > max){
                max = key.get(positions.get(key)+1);
            }
            positions.put(key, positions.get(key) + 1);
            //look for the new min
            minMove = -1;
            for(ArrayList<Integer> al : positions.keySet()){
                if(minMove == -1){
                    minMove = al.get(positions.get(al));
                } else if(minMove > al.get(positions.get(al))){
                    minMove = al.get(positions.get(al));
                }
            }
            min = minMove;
            //check if new substring smaller
            if(smallestSize > max-min){
                smallestSize = max-min;
                result = string1.substring(min, max+1);
            }
        }
        return result;
    }
}
