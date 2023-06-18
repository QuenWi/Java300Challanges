package Backspace_String_Compare;

public class Backspace_String_Compare {

    //
    public static boolean backspace_String_Compare(String string1, String string2){
        int memory;
        boolean empty = false;

        while(string1.contains("#") && !empty){
            if(string1.indexOf('#') == 0){
                memory = 1;
                while(string1.charAt(memory) == '#'){
                    memory++;
                    if(memory > string1.length()){
                        empty = true;
                        break;
                    }
                }
                if(memory == 1){
                    string1 = string1.substring(2);
                } else{
                    string1 = string1.substring(1, memory) + string1.substring(memory+1);
                }
            } else{
                if(string1.indexOf('#') == 1){
                    string1 = string1.substring(2);
                } else{
                    string1 = string1.substring(0, string1.indexOf('#') - 1) + string1.substring(string1.indexOf('#') + 1);
                }
            }
        }

        while(string2.contains("#")){
            if(string2.indexOf('#') == 0){
                memory = 1;
                while(string2.charAt(memory) == '#'){
                    memory++;
                    if(memory > string2.length()){
                        return empty;
                    }
                }
                if(memory == 1){
                    string2 = string2.substring(2);
                } else{
                    string2 = string2.substring(1, memory) + string2.substring(memory+1);
                }
            } else{
                if(string2.indexOf('#') == 1){
                    string2 = string2.substring(2);
                } else{
                    string2 = string2.substring(0, string2.indexOf('#') - 1) + string2.substring(string2.indexOf('#') + 1);
                }
            }
        }

        //System.out.println("String1: " + string1 + "\nString2: " + string2);

        return string1.equals(string2);
    }
}
