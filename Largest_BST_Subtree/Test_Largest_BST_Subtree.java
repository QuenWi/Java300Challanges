package Largest_BST_Subtree;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;

public class Test_Largest_BST_Subtree {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> headNode = BinaryTreeNode_AsList.createRandomBinaryTree(10, 1, 99);
        //headNode = BinaryTreeNode_AsList.createNiceSearchBinaryTree(3);
        test(headNode);
    }

    private static void test(BinaryTreeNode<Integer> headNode){
        BinaryTreeNode<Integer> result = Largest_BST_Subtree.largest_BST_Subtree(headNode);

        System.out.println("Given: ");
        BinaryTreeNode_AsList.printBinaryTree(headNode);
        System.out.println("Result: ");
        BinaryTreeNode_AsList.printBinaryTree(result);
    }
}
