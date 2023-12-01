package Sum_Root_to_Leaf_Numbers;

import Helpers.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

public class Sum_Root_to_Leaf_Numbers {

    //What is the total sum of all roots to leaf numbers? The leafs only have integer numbers from 0 - 9
    public static Integer sum_Root_to_Leaf_Numbers(BinaryTreeNode<Integer> headNode){
        Integer result = 0;
        List<List<Integer>> paths = new ArrayList<>();
        checkNode(paths, new ArrayList<>(), headNode);
        for(List<Integer> path : paths){
            for(int i = 0; i < path.size(); i++){
                result += path.get(i) * (int)Math.pow(10, (double)path.size()-1-i);
            }
        }
        return result;
    }

    private static void checkNode(List<List<Integer>> paths, List<Integer> path, BinaryTreeNode<Integer> node){
        path.add(node.value);
        if(node.leftBranch == null && node.rightBranch == null){
            paths.add(path);
        } else{
            if(node.leftBranch != null){
                checkNode(paths, new ArrayList<>(List.copyOf(path)), node.leftBranch);
            }
            if(node.rightBranch != null){
                checkNode(paths, new ArrayList<>(List.copyOf(path)), node.rightBranch);
            }
        }
    }
}
