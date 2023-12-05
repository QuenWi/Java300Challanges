package Find_Leaves_of_Binary_Tree;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;
import Helpers.PrintArrayOrList;

import java.util.List;

public class Test_Find_Leaves_of_Binary_Tree {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> headNode = BinaryTreeNode_AsList.createRandomBinaryTree(7, 1, 99);
        test(headNode);
    }

    private static void test(BinaryTreeNode<Integer> headNode){
        System.out.println("Given: ");
        BinaryTreeNode_AsList.printBinaryTree(headNode);

        List<List<Integer>> matrix = Find_Leaves_of_Binary_Tree.find_Leaves_of_Binary_Tree(headNode);
        System.out.println("Result: " + PrintArrayOrList.listMatrixToString(matrix));
    }
}
