package Balanced_Binary_Tree;

import Helpers.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

public class Balanced_Binary_Tree {

    //Returns, if a binary tree is balanced
    public static <T> Boolean balanced_Binary_Tree(BinaryTreeNode<T>  headNode){
        List<Integer> smallestHeight = new ArrayList<>();
        smallestHeight.add(-1);
        smallestHeight.add(-1);
        return checkNods(headNode, smallestHeight, 1);
    }

    public static <T> Boolean checkNods(BinaryTreeNode<T> node, List<Integer> smallestHeight, int height){
        if(node.rightBranch == null || node.leftBranch == null){
            System.out.println(height);
            if(smallestHeight.get(0) == -1){
                smallestHeight.set(0, height);
            } else{
                if(!(height - smallestHeight.get(0) < 2)){
                    return Boolean.FALSE;
                } else if(height != smallestHeight.get(0)){
                    if(smallestHeight.get(1) == -1){
                        smallestHeight.set(1, height);
                    } else if(height != smallestHeight.get(1)){
                        return Boolean.FALSE;
                    }
                }
            }
        }
        if(node.leftBranch != null){
            if(!checkNods(node.leftBranch, smallestHeight, height+1)){
                return Boolean.FALSE;
            }
        }
        if(node.rightBranch != null){
            if(!checkNods(node.rightBranch, smallestHeight, height+1)){
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }
}
