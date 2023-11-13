package Flatten_Binary_Tree_to_Linked_List;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;

import java.util.List;

public class Flatten_Binary_Tree_to_Linked_List {

    //Flattens a binary tree
    public static <T> void flatten_Binary_Tree_to_Linked_List(BinaryTreeNode<T> headNode){
        List<T> elements = BinaryTreeNode_AsList.binaryTreeNode_AsList(headNode);
        headNode.rightBranch = null;
        headNode.leftBranch = null;
        for(int i = 1; i < elements.size(); i++){
            if(elements.get(i) == null){
                elements.remove(i);
                i--;
            }
        }
        BinaryTreeNode<T> lastNode = headNode;
        for(int i = 1; i < elements.size(); i++){
            BinaryTreeNode<T> newNode = new BinaryTreeNode<>(elements.get(i));
            lastNode.rightBranch = newNode;
            lastNode = newNode;
        }
    }
}
