package Partition_Labels;

import java.util.ArrayList;
import java.util.List;

public class Partition_Labels {

    //splitting up a string into subareas. Each character can only be in maximum one area.
    public static Integer[] partition_Labels(String string){
        List<Integer> list = new ArrayList<Integer>();
        char[] array = string.toCharArray();
        int start = -1; //Because the array starts at 0, it has to be -1!
        int end = 0;
        for(int i = 0; i < string.length(); i++){
            if(end < string.lastIndexOf(array[i])){
                end = string.lastIndexOf(array[i]);
            }
            if(end == i){
                list.add(end - start);
                start = end;
            }
        }
        return list.toArray(Integer[]::new);
    }
}
