package Valid_Palindrome;

public class Valid_Palindrome {

    //Check if a string is apalindrom
    public static boolean valid_Palindrom(String string){
        string = string.toLowerCase();
        int i = 0;
        int j = string.length()-1;
        while(i < j){
            while(!Character.isLetter(string.charAt(i))){
                i++;
            }
            while(!Character.isLetter(string.charAt(j))){
                j--;
            }
            if(string.charAt(i) != string.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
