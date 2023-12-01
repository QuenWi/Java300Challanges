package Sum_Root_to_Leaf_Numbers;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;

public class Test_Sum_Root_to_Leaf_Numbers {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> headNode = BinaryTreeNode_AsList.createRandomBinaryTree(6, 0, 9);
        test(headNode);
    }

    private static void test(BinaryTreeNode<Integer> headNode){
        Integer result = Sum_Root_to_Leaf_Numbers.sum_Root_to_Leaf_Numbers(headNode);

        System.out.println("Given: ");
        BinaryTreeNode_AsList.printBinaryTree(headNode);
        System.out.println("Result: " + result.toString());
    }
}
