package Binary_Tree_Vertical_Order_Traversal;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;
import Helpers.PrintArrayOrList;

import java.util.List;

public class Test_Binary_Tree_Vertical_Order_Traversal {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> headNode = BinaryTreeNode_AsList.createRandomBinaryTree(10, 1, 100);
        test(headNode);
    }

    private static void test(BinaryTreeNode<Integer> headNode){
        List<Integer> result = Binary_Tree_Vertical_Order_Traversal.binary_Tree_Vertical_Order_Traversal(headNode);

        System.out.println("Given: ");
        BinaryTreeNode_AsList.printBinaryTree(headNode);
        System.out.println("Result: " + PrintArrayOrList.listToString(result));
    }
}
