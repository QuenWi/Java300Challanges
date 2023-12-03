package Closest_Binary_Search_Tree_Value;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;

public class Test_Closest_Binary_Search_Tree_Value {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> headNode = BinaryTreeNode_AsList.createRandomBinarySearchTree(0, 99, 4, 18);
        test(headNode, 50);
    }

    private static void test(BinaryTreeNode<Integer> headNode, Integer value){
        Integer result = Closest_Binary_Search_Tree_Value.closest_Binary_Search_Tree_Value(headNode, value);

        System.out.println("Given: ");
        BinaryTreeNode_AsList.printBinaryTree(headNode);
        System.out.println("Result: " + result.toString());
    }
}
