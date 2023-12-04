package Maximum_Depth_of_Binary_Tree;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;

public class Test_Maximum_Depth_of_Binary_Tree {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> headNode = BinaryTreeNode_AsList.createRandomBinaryTree(7, 1, 99);
        test(headNode);
    }

    private static void test(BinaryTreeNode<Integer> headNode){
        Integer result = Maximum_Depth_of_Binary_Tree.maximum_Depth_of_Binary_Tree(headNode);

        System.out.println("Given: ");
        BinaryTreeNode_AsList.printBinaryTree(headNode);
        System.out.println("Result: " + result.toString());
    }
}
