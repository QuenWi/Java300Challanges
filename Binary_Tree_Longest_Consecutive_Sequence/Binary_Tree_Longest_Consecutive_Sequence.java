package Binary_Tree_Longest_Consecutive_Sequence;

import Helpers.BinaryTreeNode;

public class Binary_Tree_Longest_Consecutive_Sequence {

    //What is the longest consecutive sequence in a tree. (only top to bottom)
    public static <T extends Number> Integer binary_Tree_Longest_Consecutive_Sequence(BinaryTreeNode<T> headNode){
        result = 0;
        controlTree(headNode, 1);
        return result;
    }

    static Integer result;

    private static <T extends Number> void controlTree(BinaryTreeNode<T> node, int moved){
        if(moved > result){
            result = moved;
        }
        if(node.leftBranch != null){
            if(compare(node.value, node.leftBranch.value)){
                controlTree(node.leftBranch, moved + 1);
            } else{
                controlTree(node.leftBranch, 1);
            }
        }
        if(node.rightBranch != null){
            if(compare(node.value, node.rightBranch.value)){
                controlTree(node.rightBranch, moved + 1);
            } else{
                controlTree(node.rightBranch, 1);
            }
        }
    }

    public static <T extends Number> boolean compare(T nr1, T nr2){
        boolean result = false;
        if(nr1 instanceof Float){
            if(nr1.floatValue() < nr2.floatValue()){
                return true;
            } else{
                return false;
            }
        } else if(nr1 instanceof Double){
            if(nr1.doubleValue() < nr2.doubleValue()){
                return true;
            } else{
                return false;
            }
        } else if(nr1 instanceof Integer){
            if(nr1.intValue() < nr2.intValue()){
                return true;
            } else{
                return false;
            }
        } else if(nr1 instanceof Short){
            if(nr1.longValue() < nr2.longValue()){
                return true;
            } else{
                return false;
            }
        } else if(nr1 instanceof Byte){
            if(nr1.byteValue() < nr2.byteValue()){
                return true;
            } else{
                return false;
            }
        } else if(nr1 instanceof Short){
            if(nr1.shortValue() < nr2.shortValue()){
                return true;
            } else{
                return false;
            }
        }
        return result;
    }
}
