package Repeated_String_Match;

public class Repeated_String_Match {

    //How often do you have to repeat the first string, so that the second becomes a substring?
    //It outputs -1, if it is not possible.
    public static int repeated_String_Match(String string1, String string2){
        int j;
        int k;
        int memory;
        for(int i = 0; i < string1.length(); i++){
            memory = 1;
            j = 0;
            k = 0;
            while(string1.charAt(i + k) == string2.charAt(j)){
                k++;
                j++;
                if(k+i >= string1.length()){
                    memory++;
                    k = -i;
                }
                if(j >= string2.length()){
                    return memory;
                }
            }
        }

        return -1;
    }
}
