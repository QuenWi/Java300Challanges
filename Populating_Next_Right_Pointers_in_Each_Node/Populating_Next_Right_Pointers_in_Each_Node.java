package Populating_Next_Right_Pointers_in_Each_Node;

import Helpers.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

public class Populating_Next_Right_Pointers_in_Each_Node {

    //Each node should be connected to the node right to it.
    public static <T> void populating_Next_Right_Pointers_in_Each_Node(BinaryTreeNode<T> headNode){
        BinaryNodeWithNeighbor result = createNode(headNode, null);
        printTree(result);
    }

    private static <T> BinaryNodeWithNeighbor createNode(BinaryTreeNode<T> node, BinaryNodeWithNeighbor rightNode){
        BinaryNodeWithNeighbor newNode = new BinaryNodeWithNeighbor(node.value, rightNode);
        BinaryNodeWithNeighbor createdRightNode = null;
        if(node.rightBranch != null){
            if(rightNode == null){
                createdRightNode = createNode(node.rightBranch, null);
                newNode.rightBranch = createdRightNode;
            } else{
                createdRightNode = createNode(node.rightBranch, rightNode.leftBranch);
                newNode.rightBranch = createdRightNode;
            }
        }
        if(node.leftBranch != null){
            newNode.leftBranch = createNode(node.leftBranch, createdRightNode);
        }
        return newNode;
    }

    private static void printTree(BinaryNodeWithNeighbor headNode){
        List<BinaryNodeWithNeighbor> floor = new ArrayList<>();
        floor.add(headNode);
        List<BinaryNodeWithNeighbor> newFloor;
        while(floor.size() != 0){
            newFloor = new ArrayList<>();
            for (BinaryNodeWithNeighbor binaryNodeWithNeighbor : floor) {
                System.out.println(binaryNodeWithNeighbor.toString());
                if(binaryNodeWithNeighbor.leftBranch != null){
                    newFloor.add(binaryNodeWithNeighbor.leftBranch);
                }
                if(binaryNodeWithNeighbor.rightBranch != null){
                    newFloor.add(binaryNodeWithNeighbor.rightBranch);
                }
            }
            System.out.println();
            floor = newFloor;
        }
    }

    private static class BinaryNodeWithNeighbor <T>{
        T value;
        BinaryNodeWithNeighbor leftBranch;
        BinaryNodeWithNeighbor rightBranch;
        BinaryNodeWithNeighbor rightNeighbor;

        public BinaryNodeWithNeighbor(T value, BinaryNodeWithNeighbor rightNeighbor) {
            this.value = value;
            this.rightNeighbor = rightNeighbor;
        }

        @Override
        public String toString(){
            String leftBranchString = "null";
            String rightBranchString = "null";
            String rightNeighborString = "null";
            if(leftBranch != null){
                leftBranchString = leftBranch.value.toString();
            }
            if(rightBranch != null){
                rightBranchString = rightBranch.value.toString();
            }
            if(rightNeighbor != null){
                rightNeighborString = rightNeighbor.value.toString();
            }
            return String.format("%s: leftBranch=%s, rightBranch=%s, rightNeighbor=%s", value.toString(), leftBranchString, rightBranchString, rightNeighborString);
        }
    }
}
