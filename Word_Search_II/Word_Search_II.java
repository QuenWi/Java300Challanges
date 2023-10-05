package Word_Search_II;

import Helpers.PrintArrayOrList;

import java.util.ArrayList;
import java.util.List;

public class Word_Search_II {

    //controls what words are in a matrix. But each character can be only used once.
    public static Boolean[] word_Search_II(Character[][] matrix, String[] words){
        Character[][] matrix2 = new Character[matrix.length][matrix[0].length];
        for(int yCoor = 0; yCoor < matrix.length; yCoor++){
            for(int xCoor = 0; xCoor < matrix[0].length; xCoor++){
                matrix2[yCoor][xCoor] = matrix[yCoor][xCoor];
            }
        }

        Boolean[] result = new Boolean[words.length];
        for(int i = 0; i < words.length; i++){
            for(int yCoor = 0; yCoor < matrix.length; yCoor++){
                if(result[i] != null){
                    break;
                }
                for(int xCoor = 0; xCoor < matrix[0].length; xCoor++){
                    if(matrix2[yCoor][xCoor] == words[i].charAt(0)){
                        int foundLength = pathwalking(0, xCoor, yCoor, matrix2, words[i]);
                        if(foundLength+1 == words[i].length()){
                            matrix2[yCoor][xCoor] = '#';
                            result[i] = true;
                            break;
                        }
                    }
                }
            }
        }
        for(int i = 0; i < result.length; i++){
            if(result[i] == null){
                result[i] = false;
            }
        }
        return result;
    }

    private static int pathwalking(int atCharacter, int xCoor, int yCoor, Character[][] matrix, String word){
        if(atCharacter == word.length()-1){
            matrix[yCoor][xCoor] = '#';
            return atCharacter;
        }
        List<Integer> list = new ArrayList<>();
        list.add(atCharacter);
        if(xCoor - 1 > -1){
            if(matrix[yCoor][xCoor-1] == word.charAt(atCharacter+1)){
                list.add(pathwalking(atCharacter+1, xCoor-1, yCoor, matrix, word));
            }
        }
        if(xCoor + 1 < matrix[0].length){
            if(matrix[yCoor][xCoor+1] == word.charAt(atCharacter+1)) {
                list.add(pathwalking(atCharacter+1, xCoor+1, yCoor, matrix, word));
            }
        }
        if(yCoor - 1 > -1){
            if(matrix[yCoor-1][xCoor] == word.charAt(atCharacter+1)){
                list.add(pathwalking(atCharacter+1, xCoor, yCoor-1, matrix, word));
            }
        }
        if(yCoor + 1 < matrix.length){
            if(matrix[yCoor+1][xCoor] == word.charAt(atCharacter+1)) {
                list.add(pathwalking(atCharacter+1, xCoor, yCoor+1, matrix, word));
            }
        }

        for(int i : list) {
            if(i > atCharacter){
                atCharacter = i;
            }
        }
        if(atCharacter == word.length()-1){
            matrix[yCoor][xCoor] = '#';
        }
        return atCharacter;
    }
}
