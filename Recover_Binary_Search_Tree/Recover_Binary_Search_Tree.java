package Recover_Binary_Search_Tree;

import Helpers.BinaryTreeNode;
import Helpers.PrintArrayOrList;

import java.util.ArrayList;
import java.util.List;

public class Recover_Binary_Search_Tree {

    //Recover one mistake in a binary tree.
    public static <T extends Number> void recover_Binary_Search_Tree(BinaryTreeNode<T> headNode){
        List<T> sortedListWithError = getList(headNode);
        T firstElement = headNode.value;
        T secondElement = headNode.value;
        boolean switcher = false;
        for(int i = 1; i < sortedListWithError.size(); i++){
            if(!switcher){
                if(compare(sortedListWithError.get(i), sortedListWithError.get(i-1))){
                    switcher = true;
                    firstElement  = sortedListWithError.get(i-1);
                    secondElement  = sortedListWithError.get(i);
                }
            } else{
                if(compare(sortedListWithError.get(i), sortedListWithError.get(i-1))){
                    secondElement  = sortedListWithError.get(i);
                    break;
                }
            }
        }
        changeElementInTree(headNode, firstElement, secondElement);
    }

    private static <T> void changeElementInTree(BinaryTreeNode<T> node, T element1, T element2){
        if(node.value.equals(element1)){
            node.value = element2;
        } else if(node.value.equals(element2)){
            node.value = element1;
        }
        if(node.leftBranch != null){
            changeElementInTree(node.leftBranch, element1, element2);
        }
        if(node.rightBranch != null){
            changeElementInTree(node.rightBranch, element1, element2);
        }
    }

    private static <T> List<T> getList(BinaryTreeNode<T> headNode){
        List<T> list = new ArrayList<>();
        fillList(headNode, list);
        return list;
    }

    private static <T> void fillList(BinaryTreeNode<T> node, List<T> list){
        if(node.leftBranch != null){
            fillList(node.leftBranch, list);
        }
        list.add(node.value);
        if(node.rightBranch != null){
            fillList(node.rightBranch, list);
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
