package Lowest_Common_Ancestor_of_a_Binary_Search_Tree;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;

public class Test_Lowest_Common_Ancestor_of_a_Binary_Search_Tree {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> headNode = BinaryTreeNode_AsList.createRandomBinarySearchTree(1, 10, 1, 1);
        test(headNode, 1, 3);
        test(headNode, 6, 9);
        test(headNode, 7, 6);
        test(headNode, 1, 9);
    }

    private static void test(BinaryTreeNode<Integer> headNode, Integer nr1, Integer nr2){
        Integer result = Lowest_Common_Ancestor_of_a_Binary_Search_Tree.lowest_Common_Ancestor_of_a_Binary_Search_Tree(headNode, nr1, nr2);

        System.out.println("Given: ");
        BinaryTreeNode_AsList.printBinaryTree(headNode);
        System.out.println(nr1.toString() + " and " + nr2.toString());
        System.out.println("Result: " + result.toString());
    }
}
