package Number_of_Islands_II;

import java.util.ArrayList;
import java.util.List;

public class Number_of_Islands_II {

    //You have an n*m Field. Each field ist at the beginning water.
    //Now you can fill each water field with land. How many islands do you have afterwards?
    public static Integer number_of_Islands_II(Integer width, Integer hight, Integer[][] land){
        Grid grid = new Grid(width, hight);
        for(int i = 0; i < land.length; i++){
            grid.fill(land[i][0], land[i][1]);
        }
        return grid.getIslands();
    }

    private static class Grid{
        int width;
        int height;
        Boolean[][] filled;

        public Grid(int width, int height) {
            this.width = width;
            this.height = height;
            this.filled = new Boolean[width][height];
        }

        public void fill(int widht, int height){
            filled[widht][height] = true;
        }

        public void remove(int widht, int height){
            filled[widht][height] = null;
        }

        public int getIslands(){
            int counter = 0;
            for(int i = 0; i < this.width; i++){
                for(int j = 0; j < this.height; j++){
                    if(filled[i][j] != null){
                        counter++;
                        remove(i, j);
                        checkNeightbours(i, j);
                    }
                }
            }
            return counter;
        }

        private void checkNeightbours(int width, int height){
            if(width-1 != -1){
                if(filled[width-1][height] != null){
                    remove(width-1, height);
                    checkNeightbours(width-1, height);
                }
            }
            if(width+1 != this.width){
                if(filled[width+1][height] != null){
                    remove(width+1, height);
                    checkNeightbours(width+1, height);
                }
            }
            if(height-1 != -1){
                if(filled[width][height-1] != null){
                    remove(width, height-1);
                    checkNeightbours(width, height-1);
                }
            }
            if(height+1 != this.height){
                if(filled[width][height+1] != null){
                    remove(width, height+1);
                    checkNeightbours(width, height+1);
                }
            }
        }
    }
}
