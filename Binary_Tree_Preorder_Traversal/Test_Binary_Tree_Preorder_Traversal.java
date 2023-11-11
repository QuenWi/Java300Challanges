package Binary_Tree_Preorder_Traversal;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;
import Helpers.PrintArrayOrList;

import java.util.List;

public class Test_Binary_Tree_Preorder_Traversal {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> binaryTreeNode = BinaryTreeNode_AsList.createRandomBinaryTree(10, 0, 100);
        test(binaryTreeNode);
    }

    private static void test(BinaryTreeNode<Integer> binaryTreeNode){
        List<Integer> result = Binary_Tree_Preorder_Traversal.binary_Tree_Preorder_Traversal(binaryTreeNode);

        System.out.println("Given: ");
        BinaryTreeNode_AsList.printBinaryTree(binaryTreeNode);
        System.out.println("Result: " + PrintArrayOrList.listToString(result));
    }
}
