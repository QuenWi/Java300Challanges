package Serialize_and_Deserialize_Binary_Tree;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;

public class Test_Serialize_and_Deserialize_Binary_Tree {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> headNode = BinaryTreeNode_AsList.createRandomBinaryTree(6, 1, 99);
        test(headNode);
    }

    private static void test(BinaryTreeNode<Integer> headNode){
        System.out.println("Given: ");
        BinaryTreeNode_AsList.printBinaryTree(headNode);
        BinaryTreeNode<Integer> result = Serialize_and_Deserialize_Binary_Tree.serialize_and_Deserialize_Binary_Tree(headNode);
        System.out.println("Result: ");
        BinaryTreeNode_AsList.printBinaryTree(result);
    }
}
