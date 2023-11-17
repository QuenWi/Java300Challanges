package Lowest_Common_Ancestor_of_a_Binary_Tree;

import Helpers.BinaryTreeNode;

public class Lowest_Common_Ancestor_of_a_Binary_Tree {

    //What is the lowest common ancestor of two elements inside a binary tree (not BST)
    public static <T> T lowest_Common_Ancestor_of_a_Binary_Tree(BinaryTreeNode<T> headNode, T element1, T element2){
        return checkNode(headNode, element1, element2);
    }

    private static <T> T checkNode(BinaryTreeNode<T> node, T element1, T element2){
        if(checkIfPartOfSubtree(node.leftBranch, element1) && checkIfPartOfSubtree(node.leftBranch, element2)){
            return checkNode(node.leftBranch, element1, element2);
        } else if(checkIfPartOfSubtree(node.rightBranch, element1) && checkIfPartOfSubtree(node.rightBranch, element2)){
            return checkNode(node.rightBranch, element1, element2);
        } else{
            return node.value;
        }
    }

    private static <T> boolean checkIfPartOfSubtree(BinaryTreeNode<T> node, T element){
        if(node.value.equals(element)){
            return true;
        }
        if(node.leftBranch != null){
            if(checkIfPartOfSubtree(node.leftBranch, element)){
                return true;
            }
        }
        if(node.rightBranch != null){
            if(checkIfPartOfSubtree(node.rightBranch, element)){
                return true;
            }
        }
        return false;
    }
}
