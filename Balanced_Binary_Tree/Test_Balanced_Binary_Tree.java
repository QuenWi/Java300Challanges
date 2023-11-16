package Balanced_Binary_Tree;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;

public class Test_Balanced_Binary_Tree {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> headNode = BinaryTreeNode_AsList.createRandomBinaryTree(7, 1, 10);
        test(headNode);
    }

    private static void test(BinaryTreeNode<Integer> headNode){
        Boolean result = Balanced_Binary_Tree.balanced_Binary_Tree(headNode);

        System.out.println("Given: ");
        BinaryTreeNode_AsList.printBinaryTree(headNode);
        System.out.println("Result: " + result.toString());
    }
}
