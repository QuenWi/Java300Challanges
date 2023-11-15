package Convert_Sorted_Array_to_Binary_Search_Tree;

import Helpers.BinaryTreeNode;
import Helpers.PrintArrayOrList;

import java.util.ArrayList;
import java.util.List;

public class Convert_Sorted_Array_to_Binary_Search_Tree {

    //Convert a sorted list into a BST
    public static <T> BinaryTreeNode<T> convert_Sorted_Array_to_Binary_Search_Tree(List<T> list){
        BinaryTreeNode<T> result = createTree(list);
        return result;
    }

    private static <T> BinaryTreeNode<T> createTree(List<T> subList){
        int halfIndex = subList.size()/2;
        BinaryTreeNode<T> newNode = new BinaryTreeNode<>(subList.get(halfIndex));
        if(halfIndex != 0 && halfIndex != 1){
            newNode.leftBranch = createTree(cutList(subList, 0, halfIndex-1));
            newNode.rightBranch = createTree(cutList(subList, halfIndex+1, subList.size()-1));
        } else if (subList.size() == 2){
            newNode.leftBranch = createTree(cutList(subList, 0, halfIndex-1));
        }
        return newNode;
    }

    private static <T> List<T> cutList(List<T> list, int from, int to){
        List<T> result = new ArrayList<>();
        for(int i = from; i <= to; i++){
            result.add(list.get(i));
        }
        return result;
    }
}
