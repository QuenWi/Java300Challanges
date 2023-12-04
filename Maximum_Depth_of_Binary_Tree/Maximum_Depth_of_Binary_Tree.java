package Maximum_Depth_of_Binary_Tree;

import Helpers.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

public class Maximum_Depth_of_Binary_Tree {

    //What is the maximum depth of a binary tree?
    public static <T> Integer maximum_Depth_of_Binary_Tree(BinaryTreeNode<T> headNode){
        Integer result = 0;
        List<BinaryTreeNode<T>> currentFloor = new ArrayList<>();
        currentFloor.add(headNode);
        List<BinaryTreeNode<T>> newFloor;
        while(currentFloor.size() != 0){
            result++;
            newFloor = new ArrayList<>();
            for(BinaryTreeNode<T> node : currentFloor){
                if(node.rightBranch != null){
                    newFloor.add(node.rightBranch);
                }
                if(node.leftBranch != null){
                    newFloor.add(node.leftBranch);
                }
            }
            currentFloor = newFloor;
        }
        return result;
    }
}
