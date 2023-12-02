package Count_Complete_Tree_Nodes;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;

public class Test_Count_Complete_Tree_Nodes {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> headNode = BinaryTreeNode_AsList.createPerfectBinaryTree(4);
        test(headNode);
        headNode.rightBranch.leftBranch.rightBranch = null;
        headNode.leftBranch.leftBranch.rightBranch = null;
        headNode.leftBranch.leftBranch.leftBranch = null;
        test(headNode);
    }

    private static void test(BinaryTreeNode<Integer> headNode){
        Integer result = Count_Complete_Tree_Nodes.count_Complete_Tree_Nodes(headNode);

        System.out.println("Given: ");
        BinaryTreeNode_AsList.printBinaryTree(headNode);
        System.out.println("Result: " + result.toString());
    }
}
