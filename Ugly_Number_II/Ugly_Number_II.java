package Ugly_Number_II;

import java.util.ArrayList;
import java.util.List;

public class Ugly_Number_II {

    //Returns the kth ugly number
    public static Integer ugly_Number_II(Integer number){
        int i = 2;
        int j = 3;
        int k = 5;
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        for(int l = 1; l < number; l++){
            if(i < j && i < k){
                list.add(i);
                i+=2;
            }else if(j < k){
                list.add(j);
                j+=3;
            } else{
                list.add(k);
                k+=5;
            }
            if(i==k){
                k+=5;
            }
            if(j==k){
                k+=5;
            }
            if(i==j){
                j+=3;
            }
        }
        return list.get(list.size()-1);
    }
}
