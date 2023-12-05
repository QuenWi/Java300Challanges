package Same_Tree;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;

public class Test_Same_Tree {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> headNode1 = BinaryTreeNode_AsList.createPerfectBinaryTree(3);
        BinaryTreeNode<Integer> headNode2 = BinaryTreeNode_AsList.createPerfectBinaryTree(3);
        test(headNode1, headNode2);
        headNode2.rightBranch.leftBranch.value = 0;
        test(headNode1, headNode2);
        headNode2 = BinaryTreeNode_AsList.createPerfectBinaryTree(3);
        headNode2.rightBranch.leftBranch.rightBranch = new BinaryTreeNode<>(20);
        test(headNode1, headNode2);
    }

    private static void test(BinaryTreeNode<Integer> headNode1, BinaryTreeNode<Integer> headNode2){
        Boolean result = Same_Tree.same_Tree(headNode1, headNode2);

        System.out.println("Given: ");
        BinaryTreeNode_AsList.printBinaryTree(headNode1);
        System.out.println("and");
        BinaryTreeNode_AsList.printBinaryTree(headNode2);
        System.out.println("Result: " + result.toString());
    }
}
