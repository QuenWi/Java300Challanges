package Find_Leaves_of_Binary_Tree;

import Helpers.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

public class Find_Leaves_of_Binary_Tree {

    //Group all leaves of a tree and remove them
    public static <T> List<List<T>> find_Leaves_of_Binary_Tree(BinaryTreeNode<T> headNode){
        List<List<T>> result = new ArrayList<>();
        while(headNode.leftBranch != null || headNode.rightBranch != null){
            result.add(getEndLeaves(headNode));
        }
        List<T> newGroup = new ArrayList<>();
        newGroup.add(headNode.value);
        result.add(newGroup);
        return result;
    }

    private static <T> List<T> getEndLeaves(BinaryTreeNode<T> headNode){
        List<T> newGroup = new ArrayList<>();
        controlNode(newGroup, headNode);
        return newGroup;
    }

    private static <T> boolean controlNode(List<T> newGroup, BinaryTreeNode<T> node){
        if(node.rightBranch == null && node.leftBranch == null){
            newGroup.add(node.value);
            return false;
        } else{
            if(node.leftBranch != null){
                if(!controlNode(newGroup, node.leftBranch)){
                    node.leftBranch = null;
                }
            }
            if(node.rightBranch != null){
                if(!controlNode(newGroup, node.rightBranch)){
                    node.rightBranch = null;
                }
            }
            return true;
        }
    }
}
