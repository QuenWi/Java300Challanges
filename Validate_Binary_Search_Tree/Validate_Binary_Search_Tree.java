package Validate_Binary_Search_Tree;

import Helpers.BinaryTreeNode;

public class Validate_Binary_Search_Tree {

    //Returns, if a binary tree is a Binary Search Tree. (Right nods > Head Node && Left nods < Head Nods)
    public static <T extends Number> Boolean validate_Binary_Search_Tree(BinaryTreeNode<T> headNode){
        return binarySearchTreeNode(headNode);
    }

    private static <T extends Number> boolean binarySearchTreeNode(BinaryTreeNode<T> node){
        if(node.rightBranch != null){
            if(compare(node.value, node.rightBranch.value)){
                if(!binarySearchTreeNode(node.rightBranch)){
                    return false;
                }
            } else{
                return false;
            }
        }
        if(node.leftBranch != null){
            if(compare(node.value, node.leftBranch.value)){
                return false;
            } else{
                if(!binarySearchTreeNode(node.leftBranch)){
                    return false;
                }
            }
        }
        return true;
    }

    public static <T extends Number> boolean compare(T nr1, T nr2){
        boolean result = false;
        if(nr1 instanceof Float){
            if(nr1.floatValue() < nr2.floatValue()){
                return true;
            } else{
                return false;
            }
        } else if(nr1 instanceof Double){
            if(nr1.doubleValue() < nr2.doubleValue()){
                return true;
            } else{
                return false;
            }
        } else if(nr1 instanceof Integer){
            if(nr1.intValue() < nr2.intValue()){
                return true;
            } else{
                return false;
            }
        } else if(nr1 instanceof Short){
            if(nr1.longValue() < nr2.longValue()){
                return true;
            } else{
                return false;
            }
        } else if(nr1 instanceof Byte){
            if(nr1.byteValue() < nr2.byteValue()){
                return true;
            } else{
                return false;
            }
        } else if(nr1 instanceof Short){
            if(nr1.shortValue() < nr2.shortValue()){
                return true;
            } else{
                return false;
            }
        }
        return result;
    }
}
