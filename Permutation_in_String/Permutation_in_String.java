package Permutation_in_String;

import java.util.HashMap;

public class Permutation_in_String {

    //Is the second string a substring of any permutation of the first?
    public static Boolean permutation_in_String(String string1, String string2){
        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();
        char[] array1 = string1.toCharArray();
        char[] array2 = string2.toCharArray();
        for(int i = 0; i < array1.length; i++){
            if(hashMap1.containsKey(array1[i])){
                hashMap1.put(array1[i], hashMap1.get(array1[i]) + 1);
            } else{
                hashMap1.put(array1[i], 1);
            }
        }
        for(int i = 0; i < array2.length; i++) {
            if (hashMap2.containsKey(array2[i])) {
                hashMap2.put(array2[i], hashMap2.get(array2[i]) +1);
            } else {
                hashMap2.put(array2[i], 1);
            }
        }
        for(Character c : hashMap2.keySet()){
            if(!hashMap1.containsKey(c)){
                return false;
            }
            if(hashMap1.get(c) < hashMap2.get(c)){
                return false;
            }
        }
        return true;
    }
}
