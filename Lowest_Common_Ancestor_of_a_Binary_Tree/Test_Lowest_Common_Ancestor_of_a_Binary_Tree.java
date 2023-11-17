package Lowest_Common_Ancestor_of_a_Binary_Tree;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;

public class Test_Lowest_Common_Ancestor_of_a_Binary_Tree {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> headNode = BinaryTreeNode_AsList.createRandomBinaryTree(10, 1, 10);
        test(headNode, 2, 5);
    }

    private static void test(BinaryTreeNode<Integer> headNode, Integer nr1, Integer nr2){
        Integer result = Lowest_Common_Ancestor_of_a_Binary_Tree.lowest_Common_Ancestor_of_a_Binary_Tree(headNode, nr1, nr2);

        System.out.println("Given: ");
        BinaryTreeNode_AsList.printBinaryTree(headNode);
        System.out.println(nr1.toString() + " and " + nr2.toString());
        System.out.println("Result: " + result.toString());
    }
}
