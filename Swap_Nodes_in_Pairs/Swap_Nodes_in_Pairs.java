package Swap_Nodes_in_Pairs;

import java.util.List;

public class Swap_Nodes_in_Pairs {

    //swap each two variables
    public static <T> void swap_Nodes_in_Pairs(List<T> list){
        for(int i = 0; i < list.size()/2; i++){
            T step = list.get(i*2);
            list.set(i*2, list.get(i*2+1));
            list.set(i*2+1, step);
        }
    }
}
