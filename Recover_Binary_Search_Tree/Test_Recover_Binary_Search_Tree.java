package Recover_Binary_Search_Tree;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;

public class Test_Recover_Binary_Search_Tree {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> headNode = BinaryTreeNode_AsList.createNiceSearchBinaryTree(3);
        headNode.leftBranch.leftBranch.value = 3;
        headNode.leftBranch.rightBranch.value = 1;
        test(headNode);
        headNode = BinaryTreeNode_AsList.createNiceSearchBinaryTree(3);
        headNode.leftBranch.leftBranch.value = 2;
        headNode.leftBranch.value = 1;
        test(headNode);
    }

    private static void test(BinaryTreeNode<Integer> headNode) {
        System.out.println("Given: ");
        BinaryTreeNode_AsList.printBinaryTree(headNode);
        Recover_Binary_Search_Tree.recover_Binary_Search_Tree(headNode);
        System.out.println("Result: ");
        BinaryTreeNode_AsList.printBinaryTree(headNode);
        Recover_Binary_Search_Tree.recover_Binary_Search_Tree(headNode);
    }
}
