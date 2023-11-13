package Validate_Binary_Search_Tree;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;

public class Test_Validate_Binary_Search_Tree {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> headNode = BinaryTreeNode_AsList.createRandomBinaryTree(4, 1,  100);
        test(headNode);
    }

    private static void test(BinaryTreeNode<Integer> headNode){
        Boolean result = Validate_Binary_Search_Tree.validate_Binary_Search_Tree(headNode);

        System.out.println("Given: ");
        BinaryTreeNode_AsList.printBinaryTree(headNode);
        System.out.println("Result: " + result.toString());
    }
}
