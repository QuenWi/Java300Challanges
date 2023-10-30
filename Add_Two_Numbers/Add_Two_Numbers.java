package Add_Two_Numbers;

import java.util.LinkedList;
import java.util.List;

public class Add_Two_Numbers {

    //Numbers are represented in linkedLists in reversed order. Example (3 -> 2 -> 1) is 123
    public static LinkedList<Integer> add_Two_Numbers(LinkedList<Integer> nr1, LinkedList<Integer> nr2){
        LinkedList<Integer> result = new LinkedList<Integer>();
        boolean nextPlusOne = false;
        for(int i = 0; i < nr1.size() || i < nr2.size(); i++){
            int addToResult = 0;
            if((i < nr1.size())){
                addToResult+=nr1.get(i);
            }
            if((i < nr2.size())){
                addToResult+=nr2.get(i);
            }
            if(nextPlusOne){
                addToResult++;
                nextPlusOne = false;
            }
            if(addToResult/10 > 0){
                nextPlusOne = true;
                addToResult %= 10;
            }
            result.add(addToResult);
        }
        if(nextPlusOne){
            result.addLast(1);
        }
        return result;
    }
}
