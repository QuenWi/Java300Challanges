package Super_Ugly_Number;

import Helpers.PrintArrayOrList;

import java.util.ArrayList;
import java.util.List;

public class Super_Ugly_Number {

    //Get the kth ugliest number, but from the given set of Integers
    public static Integer super_Ugly_Number(Integer[] array, Integer number){
        List<Integer> result = new ArrayList<>();
        result.add(1);
        Integer[] memory = new Integer[array.length];
        for(int i = 0; i < array.length; i++){
            memory[i] = array[i];
        }
        Integer min;
        for(int j = 1; j < number; j++){
            min = memory[0];
            for(int i = 1; i < array.length; i++){
                if(memory[i] < min){
                    min = memory[i];
                }
            }
            result.add(min);
            for(int i = 0; i < array.length; i++){
                if(min == memory[i]){
                    memory[i] += array[i];
                }
            }
            for(int i = 0; i < array.length; i++){
                for(int k = i+1; k < array.length; k++){
                    if(memory[i] == memory[k]){
                        if(array[i] > array[k]){
                            memory[i] += array[i];
                        } else if(array[k] > array[i]) {
                            memory[k] += array[k];
                        }
                    }
                }
            }
        }

        return result.get(result.size()-1);
    }
}
