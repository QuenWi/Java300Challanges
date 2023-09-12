package Binary_Watch;

import java.util.ArrayList;
import java.util.List;

public class Binary_Watch {

    //What binary time can you represent, with k bits at 1?
    public static List<String> binary_Watch(Integer k){
        List<String> result = new ArrayList<>();
        int[] hour = {1, 2, 4, 8};
        int[] minute = {1, 2, 4, 8, 16, 32};
        List<List<Integer>> hours = new ArrayList<List<Integer>>();
        List<List<Integer>> minutes = new ArrayList<List<Integer>>();
        List<List<Integer>> preresult;
        for(int i = 0; i < 4; i++){
            preresult = new ArrayList<>();
            for(List<Integer> l : hours){
                List<Integer> lNew = new ArrayList<Integer>(l);
                lNew.add(hour[i]);
                preresult.add(lNew);
            }
            for(List<Integer> l : preresult){
                hours.add(l);
            }
            List<Integer> lNew = new ArrayList<Integer>();
            lNew.add(hour[i]);
            hours.add(lNew);
        }
        for(int i = 0; i < 6; i++){
            preresult = new ArrayList<>();
            for(List<Integer> l : minutes){
                List<Integer> lNew = new ArrayList<Integer>(l);
                lNew.add(minute[i]);
                preresult.add(lNew);
            }
            for(List<Integer> l : preresult){
                minutes.add(l);
            }
            List<Integer> lNew = new ArrayList<Integer>();
            lNew.add(minute[i]);
            minutes.add(lNew);
        }
        List<Integer> time0hour = new ArrayList<Integer>();
        hours.add(time0hour);
        List<Integer> time0Min = new ArrayList<Integer>();
        minutes.add(time0Min);

        List<Integer> possibleHours;
        List<Integer> possibleMinutes;
        int totalHour;
        int totalMin;
        for(int i = 0; i <= k; i++){
            possibleHours = new ArrayList<>();
            possibleMinutes = new ArrayList<>();
            for(List<Integer> l : hours){
                if(l.size() == i){
                    totalHour = 0;
                    for(Integer j : l){
                        totalHour += j;
                    }
                    if(totalHour < 12){
                        possibleHours.add(totalHour);
                    }
                }
            }
            for(List<Integer> l : minutes){
                if(l.size() == k-i){
                    totalMin = 0;
                    for(Integer j : l){
                        totalMin += j;
                    }
                    if(totalMin < 60){
                        possibleMinutes.add(totalMin);
                    }
                }
            }
            for(Integer j : possibleHours){
                for(Integer l : possibleMinutes){
                    result.add(Integer.toString(j) + ":" + Integer.toString(l));
                }
            }
        }
        return result;
    }
}
