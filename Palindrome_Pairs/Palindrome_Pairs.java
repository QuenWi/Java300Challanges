package Palindrome_Pairs;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Pairs {

    //returns all the pairs, which are palindromes
    public static List<List<Integer>> palindrome_Pairs(String[] array){
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(j != i){
                    if(checkIfPalindrom(array[i], array[j])){
                        List<Integer> pair = new ArrayList<Integer>();
                        pair.add(i);
                        pair.add(j);
                        result.add(pair);
                    }
                }
            }
        }
        return result;
    }

    private static boolean checkIfPalindrom(String string1, String string2){
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();
        char[] array1 = string1.toCharArray();
        char[] array2 = string2.toCharArray();
        int i = 0;
        int j = string2.length()-1;
        while(i < string1.length() && j >= 0){
            if(!Character.isAlphabetic(array1[i])){
                i++;
            } else if(!Character.isAlphabetic(array2[j])){
                j--;
            } else{
                if(array1[i] == array2[j]){
                    i++;
                    j--;
                } else{
                    return false;
                }
            }
        }
        if(i != string1.length() && Character.isAlphabetic(array1[i])){
            return false;
        }
        if(j != -1 && Character.isAlphabetic(array2[j])){
            return false;
        }
        return true;
    }
}
