package Path_Sum_II;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;
import Helpers.PrintArrayOrList;

import java.util.List;

public class Test_Path_Sum_II {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> headNode = BinaryTreeNode_AsList.createRandomBinaryTree(10, -5, 7);
        test(headNode, 9);
    }

    private static void test(BinaryTreeNode<Integer> headNode, Integer wantedSum){
        List<List<Integer>> result = Path_Sum_II.path_Sum_II(headNode, wantedSum);

        System.out.println("Given: ");
        BinaryTreeNode_AsList.printBinaryTree(headNode);
        System.out.println(" and " + wantedSum.toString());
        System.out.println("Result:  "  + PrintArrayOrList.listMatrixToString(result));
    }
}
