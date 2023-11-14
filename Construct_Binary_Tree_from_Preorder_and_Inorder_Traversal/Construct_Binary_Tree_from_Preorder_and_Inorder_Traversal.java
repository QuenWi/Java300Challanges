package Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal;

import Helpers.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {

    //Creates a binary tree from a preorder and inorder traversal list
    public static <T> BinaryTreeNode<T> construct_Binary_Tree_from_Preorder_and_Inorder_Traversal(List<T> preorder, List<T> inorder){
        BinaryTreeNode<T> result = createTree(preorder, inorder);
        return result;
    }

    private static <T> BinaryTreeNode<T> createTree(List<T> preorder, List<T> inorderLeft){
        T value = null;
        int position = -1;
        T newValue = null;
        for(int i = 0; i < preorder.size(); i++){
            if(inorderLeft.contains(preorder.get(i))){
                position = inorderLeft.indexOf(preorder.get(i));
                newValue = preorder.get(i);
                break;
            }
        }
        BinaryTreeNode<T> newNode = new BinaryTreeNode<>(newValue);
        if(position != 0){
            newNode.leftBranch = createTree(preorder, cutList(inorderLeft, 0, position-1));
        }
        if(position != inorderLeft.size()-1){
            newNode.rightBranch = createTree(preorder, cutList(inorderLeft, position+1, inorderLeft.size()-1));
        }
        return newNode;
    }

    private static <T> List<T> cutList(List<T> list, int from, int to){
        List<T> result = new ArrayList<>();
        for(int i = from; i <= to; i++){
            result.add(list.get(i));
        }
        return result;
    }
}
