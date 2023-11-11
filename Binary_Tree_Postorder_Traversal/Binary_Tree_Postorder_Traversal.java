package Binary_Tree_Postorder_Traversal;

import Helpers.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Postorder_Traversal {

    //Give a binary tree in a list in postorder traversal
    public static <T> List<T> binary_Tree_Postorder_Traversal(BinaryTreeNode<T> headNode){
        List<T> result = new ArrayList<>();
        addNode(result, headNode);
        return result;
    }

    private static <T> void addNode(List<T> list, BinaryTreeNode<T> node){
        if(node.leftBranch != null){
            addNode(list, node.leftBranch);
        }
        if(node.rightBranch != null){
            addNode(list, node.rightBranch);
        }
        list.add(node.value);
    }
}
