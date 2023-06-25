package Group_Shifted_Strings;

import Helpers.PrintArrayOrList;

import java.util.ArrayList;
import java.util.List;

public class Group_Shifted_Strings {

    //Groups all the Strings together, which are shifted the same.
    public static List<List<String>> group_Shifted_Strings(List<String> list){
        List<List<String>> result = new ArrayList<List<String>>();
        InnerDistances[] array = new InnerDistances[list.size()];
        for(int i = 0; i < list.size(); i++){
            array[i] = new InnerDistances(list.get(i));
        }
        for(int i = 0; i < array.length; i++){
            if(!array[i].includes){
                List<String> line = new ArrayList<String>();
                line.add(array[i].string);
                for(int j = i+1; j < array.length; j++){
                    if(array[i].compare(array[j])){
                        line.add(array[j].string);
                        array[j].includes = true;
                    }
                }
                result.add(line);
            }
        }

        return result;
    }

    private static class InnerDistances{
        private Integer[] distances; //discribes the distance ASCI beetween two letters. No matter if small or tall.
        private String string;
        private boolean includes = false; //Just extra, to make it faster.

        private InnerDistances(String string){
            this.string = string;
            distances = new Integer[string.length()];
            String string2 = string;
            string2.toLowerCase();
            distances[0] = 0;
            for(int i = 1; i < string.length(); i++){
                if(0 > (int)string2.charAt(i) - (int)string2.charAt(i-1)){
                    distances[i] = ((int)string2.charAt(i) - (int)string2.charAt(i-1)) + 26;
                } else{
                    distances[i] = ((int)string2.charAt(i) - (int)string2.charAt(i-1));
                }

            }
        }

        private boolean compare(InnerDistances obj2){
            if(distances.length != obj2.distances.length){
                return false;
            }
            for(int i = 1; i < distances.length; i++){
                if(distances[i] != obj2.distances[i]){
                    return false;
                }
            }
            return true;
        }
    }

}
