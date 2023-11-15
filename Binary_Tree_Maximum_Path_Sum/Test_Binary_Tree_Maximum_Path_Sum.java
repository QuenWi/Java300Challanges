package Binary_Tree_Maximum_Path_Sum;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;

public class Test_Binary_Tree_Maximum_Path_Sum {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> headNode = BinaryTreeNode_AsList.createRandomBinaryTree(8, 1, 10);
        test(headNode);
    }

    private static void test(BinaryTreeNode<Integer> headNode){
        Integer result = Binary_Tree_Maximum_Path_Sum.binary_Tree_Maximum_Path_Sum(headNode);

        System.out.println("Given: ");
        BinaryTreeNode_AsList.printBinaryTree(headNode);
        System.out.println("Result: " + result.toString());
    }
}
