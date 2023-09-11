package Reverse_Words_in_a_String_II;

public class Reverse_Words_in_a_String_II {

    //Reverse the order of words in a string.
    public static String reverse_Words_in_a_String_II(String string){
        String result = "";
        String[] array = string.split(" ");
        for(int i = array.length-1; i > 0; i--){
            result += array[i] + " ";
        }
        result += array[0];
        return result;
    }
}
