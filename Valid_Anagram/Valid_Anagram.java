package Valid_Anagram;

import java.util.Arrays;

public class Valid_Anagram {

    //Returns, if 2 strings are an anagram
    public static Boolean valid_Anagram(String string1, String string2){
        string1.toLowerCase();
        string2.toLowerCase();
        char[] array1 = string1.toCharArray();
        char[] array2 = string2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        int i = 0;
        int j = 0;
        while(!Character.isAlphabetic(array1[i])){
            i++;
        }
        while(!Character.isAlphabetic(array2[j])){
            j++;
        }
        while(i < array1.length && j < array2.length && Character.isAlphabetic(array1[i])){
            if(array1[i] != array2[j]){
                return false;
            }
            i++;
            j++;
        }
        if(i < array1.length && Character.isAlphabetic(array1[i]) || j < array2.length && Character.isAlphabetic(array2[j])){
            return false;
        }
        return true;
    }
}
