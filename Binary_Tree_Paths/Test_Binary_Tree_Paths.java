package Binary_Tree_Paths;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;
import Helpers.PrintArrayOrList;

import java.util.List;

public class Test_Binary_Tree_Paths {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> headNode = BinaryTreeNode_AsList.createRandomBinaryTree(6, 1, 99);
        test(headNode);
    }

    private static void test(BinaryTreeNode<Integer> headNode){
        List<List<Integer>> result = Binary_Tree_Paths.binary_Tree_Paths(headNode);

        System.out.println("Given: ");
        BinaryTreeNode_AsList.printBinaryTree(headNode);
        System.out.println("Result: " + PrintArrayOrList.listMatrixToString(result));
    }
}
