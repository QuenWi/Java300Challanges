package Binary_Tree_Level_Order_Traversal;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;

import java.util.List;

public class Binary_Tree_Level_Order_Traversal {

    //Returns a list of the binary tree elements in level order traversal
    public static <T> List<T> binary_Tree_Level_Order_Traversal(BinaryTreeNode<T> headNode){
        List<T> result = BinaryTreeNode_AsList.binaryTreeNode_AsList(headNode);
        for(int i = 0; i < result.size(); i++){
            if(result.get(i) == null){
                result.remove(i);
                i--;
            }
        }
        return result;
    }
}
