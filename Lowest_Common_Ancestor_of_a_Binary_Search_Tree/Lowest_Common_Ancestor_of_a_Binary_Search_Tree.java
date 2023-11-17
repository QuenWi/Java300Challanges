package Lowest_Common_Ancestor_of_a_Binary_Search_Tree;

import Helpers.BinaryTreeNode;

public class Lowest_Common_Ancestor_of_a_Binary_Search_Tree {

    //Which value is the lowest common ancestor of two elements in a BST
    public static <T extends Number> T lowest_Common_Ancestor_of_a_Binary_Search_Tree(BinaryTreeNode<T> headNode, T element1, T element2){
        if(compare(element1, element2)){
            return checkNode(headNode, element1, element2);
        } else{
            return checkNode(headNode, element2, element1);
        }
    }

    private static <T extends Number> T checkNode(BinaryTreeNode<T> node, T element1, T element2){
        if((compare(node.value, element2) || node.value.equals(element2)) && (compare(element1, node.value) || node.value.equals(element1))){
            return node.value;
        }
        else{
            if(compare(node.value, element2) || node.value.equals(element2)){
                return checkNode(node.rightBranch, element1, element2);
            } else{
                return checkNode(node.leftBranch, element1, element2);
            }
        }
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
