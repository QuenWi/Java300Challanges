package Is_Subsequence;

public class Is_Subsequence {

    //Looks if one String is a subsequence inside another string
    public static boolean is_Subsequence(String string1, String string2){
        int j = 0;
        for(int i = 0; i < string1.length(); i++){
            if(string1.charAt(i) == string2.charAt(j)){
                j++;
                if(j == string2.length()){
                    return true;
                }
            }
        }
        return false;
    }
}
