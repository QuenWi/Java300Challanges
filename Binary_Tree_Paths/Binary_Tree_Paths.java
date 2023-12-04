package Binary_Tree_Paths;

import Helpers.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Paths {

    //What are all Root to Leaf Tree Paths?
    public static <T> List<List<T>> binary_Tree_Paths(BinaryTreeNode<T> headNode){
        List<List<T>> result = new ArrayList<>();
        checkNode(headNode, result, new ArrayList<>());
        return result;
    }

    private static <T> void checkNode(BinaryTreeNode<T> node, List<List<T>> result, List<T> path){
        path.add(node.value);
        if(node.rightBranch == null && node.leftBranch == null){
            result.add(path);
        } else{
            if(node.rightBranch != null){
                checkNode(node.rightBranch, result, new ArrayList<>(List.copyOf(path)));
            }
            if(node.leftBranch != null){
                checkNode(node.leftBranch, result, new ArrayList<>(List.copyOf(path)));
            }
        }
    }
}
