package Path_Sum;

import Helpers.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

public class Path_Sum {

    //Is there a path (top to bottom), where all the elements added are a following sum?
    public static <T extends Number> Boolean path_Sum(BinaryTreeNode<T> headNode, T sum){
        if(headNode.value.equals(sum)){
            return Boolean.TRUE;
        }
        if(headNode.rightBranch != null){
            List<T> newList = new ArrayList<>();
            newList.add(headNode.value);
            if(controlNods(headNode.rightBranch, sum, newList)){
                return Boolean.TRUE;
            }
        }
        if(headNode.leftBranch != null){
            List<T> newList = new ArrayList<>();
            newList.add(headNode.value);
            if(controlNods(headNode.leftBranch, sum, newList)){
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private static <T extends Number> Boolean controlNods(BinaryTreeNode<T> node, T sum, List<T> summs){
        if(node.value.equals(sum)){
            return Boolean.TRUE;
        }
        List<T> newSumms = new ArrayList<>();
        for(int i = 0; i < summs.size(); i++) {
            T newValue = sum(summs.get(i), node.value);
            if(newValue.equals(sum)){
                return Boolean.TRUE;
            }
            newSumms.add(newValue);
        }
        newSumms.add(node.value);
        summs = newSumms;
        if(node.rightBranch != null){
            if(controlNods(node.rightBranch, sum, summs)){
                return Boolean.TRUE;
            }
        }
        if(node.leftBranch != null){
            if(controlNods(node.leftBranch, sum, summs)){
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private static <T extends Number> T sum(T nr1, T nr2){
        if(nr1 instanceof Float){
            return (T)(Number) (nr1.floatValue() + nr2.floatValue());
        } else if(nr1 instanceof Double){
            return (T)(Number) (nr1.doubleValue() + nr2.doubleValue());
        } else if(nr1 instanceof Integer){
            return (T)(Number) (nr1.intValue() + nr2.intValue());
        } else if(nr1 instanceof Long){
            return (T)(Number) (nr1.longValue() + nr2.longValue());
        } else if(nr1 instanceof Byte){
            return (T)(Number) (nr1.byteValue() + nr2.byteValue());
        } else if(nr1 instanceof Short){
            return (T)(Number) (nr1.shortValue() + nr2.shortValue());
        }
        return null;
    }
}
