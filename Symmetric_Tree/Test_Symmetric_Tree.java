package Symmetric_Tree;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;

public class Test_Symmetric_Tree {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> headNode = BinaryTreeNode_AsList.createRandomBinaryTree(3, 0, 1);
        test(headNode);
    }

    private static void test(BinaryTreeNode<Integer> headNode){
        Boolean result = Symmetric_Tree.symmetric_Tree(headNode);

        System.out.println("Given: ");
        BinaryTreeNode_AsList.printBinaryTree(headNode);
        System.out.println("Result: " + result.toString());
    }
}
