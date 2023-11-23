package Unique_Binary_Search_Trees_II;

import Helpers.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

public class Unique_Binary_Search_Trees_II {

    //What structures of trees you can with n elements? (only the shape of  the trees mater)
    public static List<BinaryTreeNode<Integer>> unique_Binary_Search_Trees_II(Integer amountOfElements){
        return possibilities(amountOfElements);
    }

    public static List<BinaryTreeNode<Integer>> possibilities(int elementsLeft){
        List<BinaryTreeNode<Integer>> possibilities = new ArrayList<>();
        if(elementsLeft == 1){
            possibilities.add(new BinaryTreeNode<>(0));
        } else if(elementsLeft != 0){
            elementsLeft--;
            for(int i = 0; i <= elementsLeft; i++){
                List<BinaryTreeNode<Integer>> rightNodes = possibilities(i);
                List<BinaryTreeNode<Integer>> leftNodes = possibilities(elementsLeft-i);
                if(rightNodes.size() == 0){
                    for(BinaryTreeNode<Integer> leftNode : leftNodes){
                        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<>(0);
                        newNode.leftBranch = leftNode;
                        possibilities.add(newNode);
                    }
                } else if(leftNodes.size() == 0){
                    for(BinaryTreeNode<Integer> rightNode : rightNodes){
                        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<>(0);
                        newNode.rightBranch = rightNode;
                        possibilities.add(newNode);
                    }
                } else{
                    for(BinaryTreeNode<Integer> rightNode : rightNodes){
                        for(BinaryTreeNode<Integer> leftNode : leftNodes){
                            BinaryTreeNode<Integer> newNode = new BinaryTreeNode<>(0);
                            newNode.rightBranch = rightNode;
                            newNode.leftBranch = leftNode;
                            possibilities.add(newNode);
                        }
                    }
                }
            }
        }
        return possibilities;
    }
}
