package The_Skyline_Problem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class The_Skyline_Problem {

    //What are the edges of a skyline?
    public static List<List<Integer>> the_Skyline_Problem(Integer[][] skyscrapers){
        List<List<Integer>> result = new ArrayList<>();
        List<Skyscraper> skyscraperList = new LinkedList<>();
        for(Integer[] array : skyscrapers){
            skyscraperList.add(new Skyscraper(array[0], array[1], array[2]));
        }
        skyscraperList.sort((o1, o2) -> {
            int comp = Integer.compare(o1.x1, o2.x1);
            if (comp == 0) {
                return Integer.compare(o1.height, o2.height);
            } else {
                return comp;
            }
        });
        List<Skyscraper> currentSkyscrapers = new LinkedList<>();
        int posX = 0;
        int currentHeight = 0;
        while(currentSkyscrapers.size() != 0 || skyscraperList.size() != 0){
            while(skyscraperList.size() > 0 && skyscraperList.get(0).x1 == posX){
                currentSkyscrapers.add(skyscraperList.get(0));
                skyscraperList.remove(0);
            }
            for(int i = 0; i < currentSkyscrapers.size(); i++){
                if(posX >= currentSkyscrapers.get(i).x2){
                    currentSkyscrapers.remove(i);
                    i--;
                }
            }
            int maxGivenHeight = 0;
            for(Skyscraper skyscraper : currentSkyscrapers){
                if(maxGivenHeight < skyscraper.height){
                    maxGivenHeight = skyscraper.height;
                }
            }
            if(currentHeight != maxGivenHeight){
                result.add(List.of(posX, currentHeight));
                result.add(List.of(posX, maxGivenHeight));
                currentHeight = maxGivenHeight;
            }
            posX++;
        }
        return result;
    }

    private static class Skyscraper{
        int x1, x2, height;

        public Skyscraper(int x1, int x2, int height) {
            this.x1 = x1;
            this.x2 = x2;
            this.height = height;
        }
    }

}
