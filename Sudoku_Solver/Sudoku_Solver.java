package Sudoku_Solver;

import Helpers.PrintArrayOrList;

import java.util.ArrayList;
import java.util.List;

public class Sudoku_Solver {

    //Outputs the result of a sudoku, if it is solveable
    public static Integer[][] sudoku_Solver(Integer[][] matrix){
        Integer[][] sudoku = new Integer[matrix.length][matrix[0].length];
        List<Integer[]> missing = new ArrayList<>();
        for(int y = 0; y  < matrix.length; y++)
        {
            for(int x = 0; x < matrix[0].length; x++){
                sudoku[y][x] = matrix[y][x];
                if(matrix[y][x] == 0){
                    missing.add(new Integer[]{y, x});
                }
            }
        }
        if(checkNextCell(sudoku, missing, 0)){
            return sudoku;
        }
        return null;
    }

    private static boolean checkNextCell(Integer[][] sudoku, List<Integer[]> missing, int counter){
        if(counter < missing.size()){
            for(int i = 1; i < 10; i++){
                sudoku[missing.get(counter)[0]][missing.get(counter)[1]] = i;
                if(checkDistrict(sudoku, missing.get(counter)) && checkHorizontal(sudoku, missing.get(counter)[0]) && checkVertical(sudoku, missing.get(counter)[1])){
                    if(checkNextCell(sudoku, missing, counter+1)){
                        return true;
                    }
                }
            }
            sudoku[missing.get(counter)[0]][missing.get(counter)[1]] = 0;
            return false;
        }
        return true;
    }

    private static boolean checkDistrict(Integer[][] sudoku, Integer[] pos){
        Boolean[] checklist = new Boolean[sudoku[0].length];
        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){
                if(sudoku[y+pos[0]%3*3][x+pos[1]%3*3] != 0){
                    if(checklist[sudoku[y+pos[0]%3*3][x+pos[1]%3*3]-1] == null){
                        checklist[sudoku[y+pos[0]%3*3][x+pos[1]%3*3]-1] = true;
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static boolean checkHorizontal(Integer[][] sudoku, int row){
        Boolean[] checklist = new Boolean[sudoku[0].length];
        for(int x = 0; x < sudoku[0].length; x++){
            if(sudoku[row][x] != 0){
                if(checklist[sudoku[row][x]-1] == null){
                    checklist[sudoku[row][x]-1] = true;
                } else{
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkVertical(Integer[][] sudoku, int column){
        Boolean[] checklist = new Boolean[sudoku.length];
        for(int y = 0; y < sudoku.length; y++){
            if(sudoku[y][column] != 0){
                if(checklist[sudoku[y][column]-1] == null){
                    checklist[sudoku[y][column]-1] = true;
                } else{
                    return false;
                }
            }
        }
        return true;
    }
}
