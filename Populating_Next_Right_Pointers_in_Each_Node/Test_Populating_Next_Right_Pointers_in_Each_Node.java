package Populating_Next_Right_Pointers_in_Each_Node;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;

public class Test_Populating_Next_Right_Pointers_in_Each_Node {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> headNode = BinaryTreeNode_AsList.createPerfectBinaryTree(4);
        test(headNode);
    }

    private static void test(BinaryTreeNode<Integer> headNode){
        System.out.println("Given: ");
        BinaryTreeNode_AsList.printBinaryTree(headNode);
        System.out.println("Result: ");
        Populating_Next_Right_Pointers_in_Each_Node.populating_Next_Right_Pointers_in_Each_Node(headNode);
    }
}
