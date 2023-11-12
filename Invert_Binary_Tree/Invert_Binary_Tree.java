package Invert_Binary_Tree;

import Helpers.BinaryTreeNode;

public class Invert_Binary_Tree {

    //Invert a binary tree
    public static <T> BinaryTreeNode<T> invert_Binary_Tree(BinaryTreeNode<T> headNode){
        BinaryTreeNode<T> result = new BinaryTreeNode<>(headNode.value);
        buildTreeReversed(result, headNode);
        return result;
    }

    private static <T> void buildTreeReversed(BinaryTreeNode<T> node, BinaryTreeNode<T> originalNode){
        if(originalNode.leftBranch != null){
            BinaryTreeNode<T> newNode = new BinaryTreeNode<T>(originalNode.leftBranch.value);
            node.rightBranch = newNode;
            buildTreeReversed(newNode, originalNode.leftBranch);
        }
        if(originalNode.rightBranch != null){
            BinaryTreeNode<T> newNode = new BinaryTreeNode<T>(originalNode.rightBranch.value);
            node.leftBranch = newNode;
            buildTreeReversed(newNode, originalNode.rightBranch);
        }
    }
}
