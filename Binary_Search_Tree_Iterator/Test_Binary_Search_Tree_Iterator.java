package Binary_Search_Tree_Iterator;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;

public class Test_Binary_Search_Tree_Iterator {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> headNode = BinaryTreeNode_AsList.createRandomBinarySearchTree(-100, 100, 10, 50);
        test(headNode);
    }

    private static void test(BinaryTreeNode<Integer> headNode){
        Binary_Search_Tree_Iterator<Integer> binarySearchTreeIterator = new Binary_Search_Tree_Iterator<Integer>(headNode);

        System.out.println("Given: ");
        BinaryTreeNode_AsList.printBinaryTree(headNode);
        System.out.println("Result: ");
        System.out.println(binarySearchTreeIterator.node.value.toString());
        while(binarySearchTreeIterator.hasNext()){
            System.out.println(binarySearchTreeIterator.next().toString());
        }
    }
}
