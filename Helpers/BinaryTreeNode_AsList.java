package Helpers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BinaryTreeNode_AsList {

    public static <T> List<T> binaryTreeNode_AsList(BinaryTreeNode<T> headNode){
        List<T> result = new ArrayList<>();
        result.add(headNode.value);
        boolean listAppended = true;
        List<BinaryTreeNode<T>> checkNods = new ArrayList<>();
        checkNods.add(headNode);
        List<BinaryTreeNode<T>> addToList;
        while(listAppended == true){
            listAppended = false;
            addToList = new ArrayList<>();
            for (int i = 0; i < checkNods.size(); i++){
                if(checkNods.get(i) == null){
                    addToList.add(null);
                    addToList.add(null);
                } else{
                    addToList.add(checkNods.get(i).leftBranch);
                    addToList.add(checkNods.get(i).rightBranch);
                }
            }
            checkNods = new ArrayList<>();
            for (BinaryTreeNode<T> node : addToList){
                if(node != null){
                    listAppended = true;
                    break;
                }
            }
            if(listAppended){
                for (BinaryTreeNode<T> node : addToList){
                    checkNods.add(node);
                    if(node != null){
                        result.add(node.value);
                    } else{
                        result.add(null);
                    }
                }
            }
        }
        return result;
    }

    public static BinaryTreeNode<Integer> createRandomBinaryTree(int size, int minValue, int maxValue){
        Random random = new Random();
        List<BinaryTreeNode<Integer>> list = new ArrayList<>();
        list.add(new BinaryTreeNode<Integer>(random.nextInt(minValue, maxValue+1)));
        int memory;
        for(int i = 1; i < size; i++){
            BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(random.nextInt(minValue, maxValue+1));
            while (true){
                memory = random.nextInt(0, list.size());
                if(50 < random.nextInt(0, 101)){
                    if(list.get(memory).leftBranch == null){
                        list.get(memory).leftBranch = newNode;
                        break;
                    }
                } else{
                    if(list.get(memory).rightBranch == null){
                        list.get(memory).rightBranch = newNode;
                        break;
                    }
                }
            }
            list.add(newNode);
        }
        return list.get(0);
    }

    public static <Integer> void printBinaryTree(BinaryTreeNode<Integer> headNode){
        List<Integer> treeAsList = binaryTreeNode_AsList(headNode);
        int i = 1;
        int j = 1;
        int floors = 1;
        while(i < treeAsList.size()){
            floors++;
            j *= 2;
            i += j;
        }
        int amountCells = j*2;

        int counter = 1;
        i = 0;
        j = 1;
        boolean first = true;
        while(i < treeAsList.size()){
            first = true;
            for(int k = 0; k <  j; k++){
                Integer value = treeAsList.get(i + k);
                if(first){
                    for(int l = 0; l < amountCells/counter/2; l++){
                        System.out.printf("      ");
                    }
                    first = false;
                } else{
                    for(int l = 0; l < amountCells/counter-1; l++){
                        System.out.printf("      ");
                    }
                }
                if(value == null){
                    System.out.printf("null  ");
                } else{
                    System.out.printf(value.toString());
                    if(!((int)value/100000 > 0)){
                        System.out.printf(" ");
                        if(!((int)value/10000 > 0)){
                            System.out.printf(" ");
                            if(!((int)value/1000 > 0)){
                                System.out.printf(" ");
                                if(!((int)value/100 > 0)){
                                    System.out.printf(" ");
                                    if(!((int)value/10 > 0)){
                                        System.out.printf(" ");
                                    }
                                }
                            }
                        }
                    }
                }
            }
            counter *= 2;
            i += j;
            j *= 2;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> head = createRandomBinaryTree(10, 1, 100);
        printBinaryTree(head);
    }
}
