package Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal;

import Helpers.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

public class Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal {

    //Create a binary tree from an inorder and  postorder traversal
    //Works only, if Tree has no duplicates!
    public static <T>BinaryTreeNode<T> construct_Binary_Tree_from_Inorder_and_Postorder_Traversal(List<T> inorder, List<T> postorder){
        BinaryTreeNode<T> result = constructTree(inorder, postorder);
        return result;
    }

    private static <T> BinaryTreeNode<T> constructTree(List<T> inorderLeft, List<T> postorder){
        T lastInBoth = null;
        for(int i = postorder.size()-1; i > -1; i--){
            if(inorderLeft.contains(postorder.get(i))){
                lastInBoth = postorder.get(i);
                break;
            }
        }
        BinaryTreeNode<T> newNode = new BinaryTreeNode<>(lastInBoth);
        int devideAt = inorderLeft.indexOf(lastInBoth);
        if(devideAt != 0){
            newNode.leftBranch = constructTree(cutList(inorderLeft, 0, devideAt-1), postorder);
        }
        if(devideAt != inorderLeft.size()-1){
            newNode.rightBranch = constructTree(cutList(inorderLeft, devideAt+1, inorderLeft.size()-1), postorder);
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
