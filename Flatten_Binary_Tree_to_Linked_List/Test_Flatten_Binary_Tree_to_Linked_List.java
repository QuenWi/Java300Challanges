package Flatten_Binary_Tree_to_Linked_List;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;

public class Test_Flatten_Binary_Tree_to_Linked_List {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> headNode = BinaryTreeNode_AsList.createRandomBinaryTree(4, 1, 10);
        test(headNode);
    }

    private static void test(BinaryTreeNode<Integer> headNode){
        System.out.println("Given: ");
        BinaryTreeNode_AsList.printBinaryTree(headNode);
        Flatten_Binary_Tree_to_Linked_List.flatten_Binary_Tree_to_Linked_List(headNode);
        System.out.println("Result: ");
        BinaryTreeNode_AsList.printBinaryTree(headNode);
    }
}
