package Substring_with_Concatenation_of_All_Words;

public class Substring_with_Concatenation_of_All_Words {

    //What substring has all words included
    public static String substring_with_Concatenation_of_All_Words(String string, String[] array){
        int min = -1;
        int max = -1;
        for(String s : array){
            if(string.contains(s)){
                if(string.indexOf(s) < min || min == -1){
                    min = string.indexOf(s);
                }
                if(string.lastIndexOf(s) + s.length() > max){
                    max = string.lastIndexOf(s) + s.length();
                }
            } else{
                return "";
            }
        }
        if(min == -1){
            return "";
        } else{
            return string.substring(min, max);
        }
    }
}
