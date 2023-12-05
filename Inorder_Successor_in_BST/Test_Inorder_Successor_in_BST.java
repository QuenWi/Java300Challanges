package Inorder_Successor_in_BST;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;

public class Test_Inorder_Successor_in_BST {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> headNode = BinaryTreeNode_AsList.createNiceSearchBinaryTree(4);
        test(headNode, headNode.leftBranch.rightBranch.rightBranch);
        test(headNode, headNode.leftBranch.leftBranch.rightBranch);
        test(headNode, headNode);
    }

    private static void test(BinaryTreeNode<Integer> headNode, BinaryTreeNode<Integer> wantedNode){
        BinaryTreeNode<Integer> result = Inorder_Successor_in_BST.inorder_Successor_in_BST(headNode, wantedNode);

        System.out.println("Given: ");
        BinaryTreeNode_AsList.printBinaryTree(headNode);
        System.out.println("and " + wantedNode.value.toString());
        System.out.println("Result: " + result.value.toString());
    }
}
