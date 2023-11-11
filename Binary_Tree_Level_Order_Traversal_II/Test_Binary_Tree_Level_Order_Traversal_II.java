package Binary_Tree_Level_Order_Traversal_II;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;
import Helpers.PrintArrayOrList;

import java.util.List;

public class Test_Binary_Tree_Level_Order_Traversal_II {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> headNode = BinaryTreeNode_AsList.createRandomBinaryTree(10, 1, 100);
        test(headNode);
    }

    private static void test(BinaryTreeNode<Integer> headNode){
        List<Integer> list = Binary_Tree_Level_Order_Traversal_II.binary_Tree_Level_Order_Traversal_II(headNode);

        System.out.println("Given: ");
        BinaryTreeNode_AsList.printBinaryTree(headNode);
        System.out.println("Result: " + PrintArrayOrList.listToString(list));
    }
}
