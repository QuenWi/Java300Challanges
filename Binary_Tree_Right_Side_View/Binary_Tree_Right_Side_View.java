package Binary_Tree_Right_Side_View;

import Helpers.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Right_Side_View {

    //what are all the most right elements of each floor
    public static <T> List<T> binary_Tree_Right_Side_View(BinaryTreeNode<T> headNode){
        List<T> result = new ArrayList<>();
        controlNode(headNode, result, 0);
        return result;
    }

    public static <T> void controlNode(BinaryTreeNode<T> node, List<T> result, int height){
        if(height > result.size()-1){
            result.add(node.value);
        }
        if(node.rightBranch != null){
            controlNode(node.rightBranch, result, height+1);
        }
        if(node.leftBranch != null){
            controlNode(node.leftBranch, result, height+1);
        }
    }
}
