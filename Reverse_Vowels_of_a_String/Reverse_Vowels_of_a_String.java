package Reverse_Vowels_of_a_String;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reverse_Vowels_of_a_String {

    //Makes small vowels tall and small tall.
    public static String reverse_Vowels_of_a_String(String string){
        char[] array = string.toCharArray();
        Character[] blueprint = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        List<Character> list = new ArrayList<Character>(Arrays.asList(blueprint));

        for(int i = 0; i < array.length; i++){
            if(list.contains(array[i])){
                array[i] = blueprint[list.indexOf(array[i]) + 5];
            }
        }
        String result = String.valueOf(array);

        return result;
    }
}
