package One_Edit_Distance;

public class One_Edit_Distance {

    //It is true, if you only need to change one character to reach the orther string.
    public static boolean one_Edit_Distance(String string1, String string2){
        if(Math.abs(string1.length() - string2.length()) > 1){
            return false;
        }
        int i = 0;
        int j = 0;
        char[] array1 = string1.toCharArray();
        char[] array2 = string2.toCharArray();
        boolean mistake = false;
        while(i < string1.length() && j < string2.length()){
            if(array1[i] != array2[j]){
                if(mistake == false){
                    mistake = true;
                    if(string1.length() > string2.length()){
                        j--;
                    } else if(string1.length() < string2.length()){
                        i--;
                    }
                } else{
                    return false;
                }
            }
            i++;
            j++;
        }

        return true;
    }
}
