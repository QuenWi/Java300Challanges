package Shortest_Distance_from_All_Buildings;

import Helpers.PrintArrayOrList;

public class Shortest_Distance_from_All_Buildings {

    //0: Empty land, 1: House, 2: Obsticle. Where you can build a house, so the sum of all distances to all buildings is minimal?
    public static Integer shortest_Distance_from_All_Buildings(Integer[][] matrix){
        Integer result = -1;
        Integer[][] walkedMap = new Integer[matrix.length][matrix[0].length];
        int sumOfBuildings = getSumOfBuildings(matrix);
        if(sumOfBuildings == 0){
            return 0;
        }
        for(int y = 0; y < matrix.length; y++){
            for(int x = 0; x < matrix[0].length; x++){
                resetWalkedMap(walkedMap);
                int sumOfDistances = getSumOfDistances(matrix, walkedMap, x, y, sumOfBuildings);
                if(sumOfDistances != -1){
                    if(result == -1){
                        result = sumOfDistances;
                    } else if(result > sumOfDistances){
                        result = sumOfDistances;
                    }
                }

            }
        }
        return result;
    }

    private static int getSumOfDistances(Integer[][] matrix, Integer[][] walkedMap, int start_x, int start_y, int sumOfBuildings){
        if(matrix[start_y][start_x] == 0){
            int sumOfDistance = 0;
            walkedMap[start_y][start_x] = 1;
            boolean changed = true;
            int counter = 1;
            while(changed){
                changed = false;
                for(int y = 0; y < walkedMap.length; y++){
                    for(int x = 0; x < walkedMap[0].length; x++){
                        if(walkedMap[y][x] == 1){
                            walkedMap[y][x] = 2;
                            if(x+1 < matrix[0].length && walkedMap[y][x+1] == 0){
                                if(matrix[y][x+1] == 0){
                                    walkedMap[y][x+1] = 3;
                                    changed = true;
                                } else {
                                    if(matrix[y][x+1] == 1){
                                        sumOfDistance += counter;
                                        sumOfBuildings--;
                                    }
                                    walkedMap[y][x+1] = 2;
                                }
                            }
                            if(y+1 < matrix.length && walkedMap[y+1][x] == 0){
                                if(matrix[y+1][x] == 0){
                                    walkedMap[y+1][x] = 3;
                                    changed = true;
                                } else {
                                    if(matrix[y+1][x] == 1){
                                        sumOfDistance += counter;
                                        sumOfBuildings--;
                                    }
                                    walkedMap[y+1][x] = 2;
                                }
                            }
                            if(x-1 > -1 && walkedMap[y][x-1] == 0){
                                if(matrix[y][x-1] == 0){
                                    walkedMap[y][x-1] = 3;
                                    changed = true;
                                } else {
                                    if(matrix[y][x-1] == 1){
                                        sumOfDistance += counter;
                                        sumOfBuildings--;
                                    }
                                    walkedMap[y][x-1] = 2;
                                }
                            }
                            if(y-1 > -1 && walkedMap[y-1][x] == 0){
                                if(matrix[y-1][x] == 0){
                                    walkedMap[y-1][x] = 3;
                                    changed = true;
                                } else {
                                    if(matrix[y-1][x] == 1){
                                        sumOfDistance += counter;
                                        sumOfBuildings--;
                                    }
                                    walkedMap[y-1][x] = 2;
                                }
                            }
                        }

                    }
                }
                if(sumOfBuildings == 0){
                    return sumOfDistance;
                }
                for(int y = 0; y < walkedMap.length; y++){
                    for(int x = 0; x < walkedMap[0].length; x++){
                        if(walkedMap[y][x] == 3){
                            walkedMap[y][x] = 1;
                        }
                    }
                }
                counter++;
            }
        }
        return -1;
    }

    private static void resetWalkedMap(Integer[][] map){
        for(int y = 0; y < map.length; y++){
            for(int x = 0; x < map[0].length; x++){
                map[y][x] = 0;
            }
        }
    }

    private static int getSumOfBuildings(Integer[][] matrix){
        int result = 0;
        for(int y = 0; y < matrix.length; y++){
            for(int x = 0; x < matrix[0].length; x++){
                if(matrix[y][x] == 1){
                    result++;
                }
            }
        }
        return result;
    }
}
