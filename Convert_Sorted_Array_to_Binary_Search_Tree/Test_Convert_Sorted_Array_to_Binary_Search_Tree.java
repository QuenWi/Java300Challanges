package Convert_Sorted_Array_to_Binary_Search_Tree;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;
import Helpers.PrintArrayOrList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test_Convert_Sorted_Array_to_Binary_Search_Tree {

    public static void main(String[] args) {
        Integer[] array = {1, 3, 5, 6, 8, 9, 10, 12};
        test(array);
    }

    private static void test(Integer[] array){
        BinaryTreeNode<Integer> result = Convert_Sorted_Array_to_Binary_Search_Tree.convert_Sorted_Array_to_Binary_Search_Tree(array);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Result: ");
        BinaryTreeNode_AsList.printBinaryTree(result);
    }
}
