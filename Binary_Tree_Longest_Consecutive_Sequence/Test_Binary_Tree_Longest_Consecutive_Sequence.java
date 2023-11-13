package Binary_Tree_Longest_Consecutive_Sequence;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;

public class Test_Binary_Tree_Longest_Consecutive_Sequence {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> headNode = BinaryTreeNode_AsList.createRandomBinaryTree(10, 1, 100);
        test(headNode);
    }

    private static void test(BinaryTreeNode<Integer> headNode){
        Integer result = Binary_Tree_Longest_Consecutive_Sequence.binary_Tree_Longest_Consecutive_Sequence(headNode);

        System.out.println("Given: ");
        BinaryTreeNode_AsList.printBinaryTree(headNode);
        System.out.println("Result: " + result.toString());
    }
}
