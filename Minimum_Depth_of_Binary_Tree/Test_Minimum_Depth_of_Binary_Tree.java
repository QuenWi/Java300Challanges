package Minimum_Depth_of_Binary_Tree;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;

public class Test_Minimum_Depth_of_Binary_Tree {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> headNode = BinaryTreeNode_AsList.createRandomBinaryTree(10, 1, 100);
        test(headNode);
    }

    private static void test(BinaryTreeNode<Integer> headNode){
        Integer result = Minimum_Depth_of_Binary_Tree.minimum_Depth_of_Binary_Tree(headNode);

        System.out.println("Given: ");
        BinaryTreeNode_AsList.printBinaryTree(headNode);
        System.out.println("Result: " + result.toString());
    }
}
