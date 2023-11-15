package Convert_Sorted_List_to_Binary_Search_Tree;

import Convert_Sorted_Array_to_Binary_Search_Tree.Convert_Sorted_Array_to_Binary_Search_Tree;
import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;
import Helpers.PrintArrayOrList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test_Convert_Sorted_List_to_Binary_Search_Tree {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 50; i += random.nextInt(1, 15)){
            list.add(i);
        }
        test(list);
    }

    private static void test(List<Integer> list){
        BinaryTreeNode<Integer> result = Convert_Sorted_List_to_Binary_Search_Tree.convert_Sorted_List_to_Binary_Search_Tree(list);

        System.out.println("Given: " + PrintArrayOrList.listToString(list));
        System.out.println("Result: ");
        BinaryTreeNode_AsList.printBinaryTree(result);
    }
}
