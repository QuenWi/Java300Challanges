package Serialize_and_Deserialize_Binary_Tree;

import Helpers.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

public class Serialize_and_Deserialize_Binary_Tree {

    //Serialize and deserialize a binary tree
    public static BinaryTreeNode<Integer> serialize_and_Deserialize_Binary_Tree(BinaryTreeNode<Integer> headNode){
        String save = saveTreeAsString(headNode);
        System.out.println("Tree saved as: " + save);
        return createTreeFromString(save);
    }

    private static String saveTreeAsString(BinaryTreeNode<Integer> headNode){
        String save = "";
        List<BinaryTreeNode<Integer>> currentFloor = new ArrayList<>();
        currentFloor.add(headNode);
        List<BinaryTreeNode<Integer>> newFloor;
        boolean finished = false;
        while(!finished){
            finished = true;
            newFloor = new ArrayList<>();
            for(BinaryTreeNode<Integer> node : currentFloor){
                if(node == null){
                    save += "#,";
                    newFloor.add(null);
                    newFloor.add(null);
                } else{
                    save += node.value.toString() + ",";
                    if(node.leftBranch != null){
                        if(finished){
                            finished = false;
                        }
                        newFloor.add(node.leftBranch);
                    } else{
                        newFloor.add(null);
                    }
                    if(node.rightBranch != null){
                        if(finished){
                            finished = false;
                        }
                        newFloor.add(node.rightBranch);
                    } else{
                        newFloor.add(null);
                    }
                }
                currentFloor = newFloor;
            }


        }
        return save;
    }

    private static BinaryTreeNode<Integer> createTreeFromString(String save){
        String[] array = save.split(",");
        int counter = 1;
        BinaryTreeNode<Integer> headNode = new BinaryTreeNode<>(Integer.parseInt(array[0]));
        List<BinaryTreeNode<Integer>> currentFloor = new ArrayList<>();
        currentFloor.add(headNode);
        List<BinaryTreeNode<Integer>> newFloor;
        while(counter < array.length){
            newFloor = new ArrayList<>();
            for(BinaryTreeNode<Integer> node : currentFloor){
                if(node == null){
                    newFloor.add(null);
                    newFloor.add(null);
                } else{
                    if(array[counter].equals("#")){
                        newFloor.add(null);
                    } else{
                        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<>(Integer.parseInt(array[counter]));
                        newFloor.add(newNode);
                        node.leftBranch = newNode;
                    }
                    if(array[counter+1].equals("#")){
                        newFloor.add(null);
                    } else{
                        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<>(Integer.parseInt(array[counter+1]));
                        newFloor.add(newNode);
                        node.rightBranch = newNode;
                    }
                }
                counter += 2;
            }
            currentFloor = newFloor;
        }
        return headNode;
    }
}
