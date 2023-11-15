package Minimum_Depth_of_Binary_Tree;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;

import java.util.ArrayList;
import java.util.List;

public class Minimum_Depth_of_Binary_Tree {

    //What is the minimum depths inside a tree
    public static <T> Integer minimum_Depth_of_Binary_Tree(BinaryTreeNode<T> headNode){
        Integer result = 1;
        List<BinaryTreeNode<T>> floor = new ArrayList<>();
        floor.add(headNode);
        boolean finished;
        while(true){
            finished = false;
            List<BinaryTreeNode<T>> newFloor = new ArrayList<>();
            for(BinaryTreeNode<T> node : floor){
                if(node.leftBranch != null){
                    newFloor.add(node.leftBranch);
                    if(node.rightBranch != null){
                        newFloor.add(node.rightBranch);
                    }
                } else if(node.rightBranch != null){
                    newFloor.add(node.rightBranch);
                } else{
                    finished = true;
                    break;
                }
            }
            if(finished){
                break;
            }
            floor = newFloor;
            result++;
        }
        return result;
    }
}
