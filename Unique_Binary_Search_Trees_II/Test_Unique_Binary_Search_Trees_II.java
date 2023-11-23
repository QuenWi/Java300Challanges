package Unique_Binary_Search_Trees_II;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;

import java.util.List;

public class Test_Unique_Binary_Search_Trees_II {

    public static void main(String[] args) {
        test(4);
    }

    private static void test(Integer amountOfElements){
        List<BinaryTreeNode<Integer>> result = Unique_Binary_Search_Trees_II.unique_Binary_Search_Trees_II(amountOfElements);

        System.out.println("Given: " + amountOfElements.toString());
        System.out.println("Result: ");
        for(BinaryTreeNode<Integer> headNode : result){
            BinaryTreeNode_AsList.printBinaryTree(headNode);
            System.out.println();
        }
    }
}
