package Same_Tree;

import Helpers.BinaryTreeNode;

public class Same_Tree {

    //check if two trees are the same
    public static <T> Boolean same_Tree(BinaryTreeNode<T> headNode1, BinaryTreeNode<T> headNode2){
        return checkNode(headNode1, headNode2);
    }

    private static <T> boolean checkNode(BinaryTreeNode<T> node1, BinaryTreeNode<T> node2){
        if(node1.value.equals(node2.value)){
            if(node1.rightBranch == null && node2.rightBranch == null && node1.leftBranch == null && node2.leftBranch == null){
                return true;
            } else{
                if(node1.rightBranch == null && node2.rightBranch == null || node1.rightBranch != null && node2.rightBranch != null){
                    if(!checkNode(node1.rightBranch, node2.rightBranch)){
                        return false;
                    }
                } else{
                    return false;
                }
                if(node1.leftBranch == null && node2.leftBranch == null || node1.leftBranch != null && node2.leftBranch != null){
                    if(!checkNode(node1.leftBranch, node2.leftBranch)){
                        return false;
                    }
                } else{
                    return false;
                }
                return true;
            }
        } else{
            return false;
        }
    }
}
