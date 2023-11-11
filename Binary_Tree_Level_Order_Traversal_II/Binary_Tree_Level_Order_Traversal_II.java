package Binary_Tree_Level_Order_Traversal_II;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;
import Helpers.PrintArrayOrList;

import java.util.LinkedList;
import java.util.List;

public class Binary_Tree_Level_Order_Traversal_II {

    //Return the elements of a binary tree in Level order traversal, from bottom to top
    public static <T> List<T> binary_Tree_Level_Order_Traversal_II(BinaryTreeNode<T> headNode){
        LinkedList<T> result = new LinkedList<>(BinaryTreeNode_AsList.binaryTreeNode_AsList(headNode));
        int counter = 1;
        int counter2 = 0;
        while(counter2 < result.size()){
            for(int i = counter-1; i >= 0; i--){
                result.addFirst(result.get(counter2+counter-1));
                result.remove(counter2+counter);
            }
            counter2 += counter;
            counter *= 2;
        }
        for(int i = 0; i < result.size(); i++){
            if(result.get(i) == null){
                result.remove(i);
                i--;
            }
        }
        return result;
    }
}
