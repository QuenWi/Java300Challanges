package Binary_Tree_Preorder_Traversal;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Preorder_Traversal {

    //return the elements of a binary tree in preorder traversal
    public static <T> List<T> binary_Tree_Preorder_Traversal(BinaryTreeNode<T> headNode){
        List<T> result = new ArrayList<>();
        addToList(result, headNode);
        return result;
    }

    private static <T> void addToList(List<T> list, BinaryTreeNode<T> binaryTreeNode){
        list.add(binaryTreeNode.value);
        if(binaryTreeNode.leftBranch != null){
            addToList(list, binaryTreeNode.leftBranch);
        }
        if(binaryTreeNode.rightBranch != null){
            addToList(list, binaryTreeNode.rightBranch);
        }
    }
}
