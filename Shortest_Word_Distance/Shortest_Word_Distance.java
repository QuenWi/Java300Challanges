package Shortest_Word_Distance;

import java.util.ArrayList;
import java.util.List;

public class Shortest_Word_Distance {

    //Looks what the distance between two objects in a list is.
    //This is the solution for Shortest_Word_distance 1 and 3.
    public static <T> int shortest_Word_Distance (T[] array, T obj1, T obj2){
        if(obj1.equals(obj2)){
            List<Integer> positions = new ArrayList<Integer>();
            for(int i = 0; i < array.length; i++){
                if(array[i].equals(obj1)){
                    positions.add(i);
                }
            }
            if(positions.size() < 2){
                return -1;
            }
            int min = positions.get(1) - positions.get(0);
            for(int i = 2; i < positions.size(); i++){
                if(positions.get(i) - positions.get(i-1) < min){
                    min = positions.get(i) - positions.get(i-1);
                }
            }
            return min;
        } else{
            List<Integer> positions1 = new ArrayList<Integer>();
            List<Integer> positions2 = new ArrayList<Integer>();
            for(int i = 0; i < array.length; i++){
                if(array[i].equals(obj1)){
                    positions1.add(i);
                }
                if(array[i].equals(obj2)){
                    positions2.add(i);
                }
            }
            if(positions1.size() < 1 || positions2.size() < 1){
                return -1;
            }

            int i = 0;
            int j = 0;
            int min = Math.abs(positions1.get(i) - positions2.get(j));
            while(i < positions1.size() && j < positions2.size()){
                if(Math.abs(positions1.get(i) - positions2.get(j)) < min){
                    min = Math.abs(positions1.get(i) - positions2.get(j));
                }
                if(positions1.get(i) > positions2.get(j)){
                    if(j < positions2.size() ){
                        j++;
                    } else{
                        i++;
                    }
                } else{
                    if(i < positions1.size()){
                        i++;
                    } else{
                        j++;
                    }
                }
            }
            return min;
        }
    }
}
