package Symmetric_Tree;

import Helpers.BinaryTreeNode;

public class Symmetric_Tree {

    //returns, if a tree is symmetric
    public static <T> Boolean symmetric_Tree(BinaryTreeNode<T> headNode){
        return checkNods(headNode, headNode);
    }

    private static <T> Boolean checkNods(BinaryTreeNode<T> node1, BinaryTreeNode<T> node2){
        if(node1.value.equals(node2.value)){
            if(node1.leftBranch == null || node2.rightBranch == null){
                if(node1.leftBranch != null || node2.rightBranch != null){
                    return Boolean.FALSE;
                }
            } else{
                if(!checkNods(node1.leftBranch, node2.rightBranch)){
                    return Boolean.FALSE;
                }
            }
            if(node1.rightBranch == null || node2.leftBranch == null){
                if(node1.rightBranch != null || node2.leftBranch != null){
                    return Boolean.FALSE;
                }
            } else{
                if(!checkNods(node1.rightBranch, node2.leftBranch)){
                    return Boolean.FALSE;
                }
            }
        } else{
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
