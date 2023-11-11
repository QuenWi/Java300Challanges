package Binary_Tree_Inorder_Traversal;

import Helpers.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Inorder_Traversal {

    //returns a List of the Binary tree elements in Inorder traversal
    public static <T> List<T> binary_Tree_Inorder_Traversal(BinaryTreeNode<T> headNode){
        List<T> result = new ArrayList<>();
        addNods(result, headNode);
        return result;
    }

    private static <T> void addNods(List<T> list, BinaryTreeNode<T> binaryTreeNode){
        if(binaryTreeNode.leftBranch != null){
            addNods(list, binaryTreeNode.leftBranch);
        }
        list.add(binaryTreeNode.value);
        if(binaryTreeNode.rightBranch != null){
            addNods(list, binaryTreeNode.rightBranch);
        }
    }
}
