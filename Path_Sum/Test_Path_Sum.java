package Path_Sum;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;

public class Test_Path_Sum {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> headNode = BinaryTreeNode_AsList.createRandomBinaryTree(8, -5,  7);
        test(headNode, 9);
    }

    private static void test(BinaryTreeNode<Integer> headNode, Integer wantedSum){
        Boolean result = Path_Sum.path_Sum(headNode, wantedSum);

        System.out.println("Given: ");
        BinaryTreeNode_AsList.printBinaryTree(headNode);
        System.out.println("and " + wantedSum.toString());
        System.out.println("Result: " + result.toString());
    }
}
