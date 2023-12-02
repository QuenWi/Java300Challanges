package Count_Complete_Tree_Nodes;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;

import java.util.List;

public class Count_Complete_Tree_Nodes {

    //How many nodes are in a complete tree?
    public static <T> Integer count_Complete_Tree_Nodes(BinaryTreeNode<T> headNode){
        List<T> elements = BinaryTreeNode_AsList.binaryTreeNode_AsList(headNode);
        Integer result = elements.size();
        for(int i = elements.size()-1; i > elements.size()/2-1; i--){
            if(elements.get(i) == null){
                result--;
            }
        }
        return result;
    }
}
