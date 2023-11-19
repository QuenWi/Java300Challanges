package Kth_Smallest_Element_in_a_BST;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;

public class Test_Kth_Smallest_Element_in_a_BST {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> headNode = BinaryTreeNode_AsList.createRandomBinaryTree(8, 1, 100);
        test(headNode, 2);
        test(headNode, 3);
    }

    private static void test(BinaryTreeNode<Integer> headNode, Integer getKthSmallest){
        Integer result = Kth_Smallest_Element_in_a_BST.kth_Smallest_Element_in_a_BST(headNode, getKthSmallest);

        System.out.println("Given: ");
        BinaryTreeNode_AsList.printBinaryTree(headNode);
        System.out.println("and " + getKthSmallest.toString());
        System.out.println("Result: " + result.toString());
    }
}
