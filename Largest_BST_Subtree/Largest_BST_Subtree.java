package Largest_BST_Subtree;

import Helpers.BinaryTreeNode;

public class Largest_BST_Subtree {

    //What is the largest BST inside a Binary Tree?
    public static <T extends Number> BinaryTreeNode<T> largest_BST_Subtree(BinaryTreeNode<T> headNode){
        Save<T> save = new Save<>();
        save.length = 0;
        controlNode(headNode, save);
        return save.node;
    }

    private static <T extends Number> void controlNode(BinaryTreeNode<T> node, Save<T> save) {
        if (isBST(node)) {
            int count = countTree(node);
            if(save.length < count){
                save.length = count;
                save.node = node;
            }
        } else{
            if(node.leftBranch != null){
                controlNode(node.leftBranch, save);
            }
            if(node.rightBranch != null){
                controlNode(node.rightBranch, save);
            }
        }
    }

    private static <T extends Number> boolean isBST(BinaryTreeNode<T> node){
        if(node.leftBranch != null){
            if(compare(node.leftBranch.value, node.value)){
                if(!isBST(node.leftBranch)){
                    return false;
                }
            } else{
                return false;
            }
        }
        if(node.rightBranch != null){
            if(compare(node.value, node.rightBranch.value)){
                if(!isBST(node.rightBranch)){
                    return false;
                }
            } else{
                return false;
            }
        }
        return true;
    }

    private static <T extends Number> int countTree(BinaryTreeNode<T> node){
        int counter = 1;
        if(node.leftBranch != null){
            counter += countTree(node.leftBranch);
        }
        if(node.rightBranch != null){
            counter += countTree(node.rightBranch);
        }
        return counter;
    }

    private static class Save<T extends Number>{
        BinaryTreeNode<T> node;
        int length;
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
