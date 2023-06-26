package Isomorphic_Strings;

import java.util.HashMap;

public class Isomorphic_Strings {

    //shows if 2 strings are ismorphic
    //You can replace the characters in the first string, to get the second
    public static Boolean isomorphic_Strings(String string1, String string2, boolean surjectiv){
        HashMap<Character, Character> hashMap = new HashMap<>();
        if(string1.length() != string2.length()){
            return false;
        }
        char[] array1 = string1.toCharArray();
        char[] array2 = string2.toCharArray();
        for(int i = 0; i < array1.length; i++){
            if(hashMap.containsKey(array1[i])){
                if(hashMap.get(array1[i]) != array2[i]){
                    //System.out.println(array1[i] + ": " + hashMap.get(array1[i]) + " != " + array2[i]);
                    return false;
                }
            } else{
                if(!surjectiv && hashMap.containsValue(array2[i])){
                    return false;
                }
                //System.out.println(array1[i] + " => " + array2[i]);
                hashMap.put(array1[i], array2[i]);
            }
        }
        return true;

    }
}
