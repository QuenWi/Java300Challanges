package Minimum_Cost_to_Hire_K_Workers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Minimum_Cost_to_Hire_K_Workers {

    //You want to spent the least amount of money for k workers.
    //You must pay them equaly to their done work and minimum their minimum wage
    public static <T extends Number> Integer[] minimum_Cost_to_Hire_K_Workers(T[] quality, T[] minimumWage, Integer size){
        Integer[] result = new Integer[size];
        List<Worker> list = new ArrayList<>();
        for(int i = 0; i < quality.length; i++){
            Worker newWorker = new Worker(quality[i], minimumWage[i]);
            list.add(newWorker);
        }
        list.sort(new CompareWorkerRatio());
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).toString());
        }

        List<Worker> sortedByQuality = new ArrayList<>();
        /*for(int i = 0; i < size-1; i++){
            sortedByQuality.add(list.get(i));
        }*/ //This one is very good for checking if everything runs good
        float min = -1f;
        float memory;
        for(int i = size-1; i < list.size(); i++){
            sortedByQuality.sort(new CompareWorkerQuality());
            memory = 0;
            for(int j = 0; j < size-1; j++){
                memory += sortedByQuality.get(j).quality*list.get(i).ratio;
            }
            memory += list.get(i).minimumWage;
            if(min == -1){
                min = memory;
                for(int j = 0; j < size-1; j++){
                    result[j] = sortedByQuality.get(j).number;
                }
                result[result.length-1] = list.get(i).number;
            } else if(memory < min){
                min = memory;
                for(int j = 0; j < size-1; j++){
                    result[j] = sortedByQuality.get(j).number;
                }
                result[result.length-1] = list.get(i).number;
            }
            sortedByQuality.add(list.get(i));
        }
        return result;
    }

    private static class Worker{
        float quality;
        float minimumWage;
        float ratio;
        static int counter = 0;
        int number;

        private <T extends Number> Worker(T quality, T minimumWage){
            this.quality = quality.floatValue();
            this.minimumWage = minimumWage.floatValue();
            this.ratio = quality.floatValue() / minimumWage.floatValue();
            number = counter;
            counter++;
        }

        @Override
        public String toString(){
            return String.format("Quality: %s, Minimum wage: %s, Ratio: %s, Number: %s", quality, minimumWage, ratio, number);
        }
    }

    private static class CompareWorkerRatio implements Comparator<Worker>{
        @Override
        public int compare(Worker o1, Worker o2) {
            return Float.compare(o1.ratio, o2.ratio);
        }
    }

    private static class CompareWorkerQuality implements Comparator<Worker>{
        @Override
        public int compare(Worker o1, Worker o2) {
            return Float.compare(o1.quality, o2.quality);
        }
    }
}
