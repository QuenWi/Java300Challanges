package Verify_Preorder_Serialization_of_a_Binary_Tree;

import java.util.List;

public class Verify_Preorder_Serialization_of_a_Binary_Tree {

    //is a list a preordered binary tree (where all nulls are in the list)
    public static <T> Boolean verify_Preorder_Serialization_of_a_Binary_Tree(List<T> list){
        int elementsPerLevel = 1;
        int elementsInTree = 0;
        double levels = -1;
        while(elementsInTree < list.size()){
            elementsInTree += elementsPerLevel;
            elementsPerLevel *= 2;
            levels++;
        }
        if(elementsInTree != list.size()){
            return Boolean.FALSE;
        }
        elementsInTree++;
        return checkNods(list, 0, 0, true, levels, elementsInTree);
    }

    private static <T> Boolean checkNods(List<T> list, double position, int floorLevel, boolean lastNumber, double levels, int elementsInTree){
        if(list.get((int) position) == null){
            lastNumber = false;
        } else {
            if(lastNumber == false){
                return Boolean.FALSE;
            }
        }
        if(levels != floorLevel){
            //System.out.println((int)position + ": " + (int)(position+1) + ", " + (int)(position+Math.pow(2d, levels-floorLevel)));
            if(!checkNods(list, position+1, floorLevel+1, lastNumber, levels, elementsInTree)){
                return Boolean.FALSE;
            }
            if(!checkNods(list, position+Math.pow(2d, levels-floorLevel), floorLevel+1, lastNumber, levels, elementsInTree)){
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }
}


   /*
    size: 15
    level: 4
            8, 4, 2

            0 -> 1, 8

            1 -> 2, 5
            8 -> 9, 12

            2 -> 3, 4
            5 -> 6, 7
            9 -> 10, 11
            12 -> 13, 14
*/


