package Inorder_Successor_in_BST;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;

public class Inorder_Successor_in_BST {

    //Get the next greater value of a given node.
    public static <T extends Number> BinaryTreeNode<T> inorder_Successor_in_BST(BinaryTreeNode<T> headNode, BinaryTreeNode<T> givenNode){
        if(givenNode.rightBranch == null){
            return getParent(headNode, givenNode);
        } else{
            return getChild(givenNode);
        }
    }

    private static <T extends Number>BinaryTreeNode<T> getParent(BinaryTreeNode<T> headNode, BinaryTreeNode<T> givenNode){
        BinaryTreeNode<T> result = null;
        BinaryTreeNode<T> controlNode = headNode;
        while(true){
            if(controlNode.value.equals(givenNode.value)){
                break;
            }
            if(!compare(givenNode.value, controlNode.value)){
                if(controlNode.rightBranch != null){
                    controlNode = controlNode.rightBranch;
                } else{
                    break;
                }
            } else{
                if(result == null){
                    result = controlNode;
                } else if(compare(controlNode.value, result.value)){
                    result = controlNode;
                }
                if(controlNode.leftBranch != null){
                    controlNode = controlNode.leftBranch;
                } else{
                    break;
                }
            }
        }
        return result;
    }

    private static <T extends Number>BinaryTreeNode<T> getChild(BinaryTreeNode<T> givenNode){
        BinaryTreeNode<T> result = givenNode.rightBranch;
        while(result.leftBranch != null){
            result = result.leftBranch;
        }
        return result;
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
