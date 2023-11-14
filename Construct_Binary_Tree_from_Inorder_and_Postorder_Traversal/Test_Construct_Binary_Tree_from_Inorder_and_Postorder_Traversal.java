package Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal;

import Binary_Tree_Inorder_Traversal.Binary_Tree_Inorder_Traversal;
import Binary_Tree_Postorder_Traversal.Binary_Tree_Postorder_Traversal;
import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;

import java.util.List;

public class Test_Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> headNode = BinaryTreeNode_AsList.createRandomBinaryTree(8, 1,  100);
        test(headNode);
    }

    private static void test(BinaryTreeNode<Integer> headNode){
        List<Integer> inorder = Binary_Tree_Inorder_Traversal.binary_Tree_Inorder_Traversal(headNode);
        List<Integer> postorder = Binary_Tree_Postorder_Traversal.binary_Tree_Postorder_Traversal(headNode);
        BinaryTreeNode<Integer> result = Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal.construct_Binary_Tree_from_Inorder_and_Postorder_Traversal(inorder, postorder);

        System.out.println("Given: ");
        BinaryTreeNode_AsList.printBinaryTree(headNode);
        System.out.println("Result: ");
        BinaryTreeNode_AsList.printBinaryTree(result);
    }
}
