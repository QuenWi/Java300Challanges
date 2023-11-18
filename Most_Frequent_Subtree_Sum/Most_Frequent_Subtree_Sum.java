package Most_Frequent_Subtree_Sum;

import Helpers.BinaryTreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Most_Frequent_Subtree_Sum {

    //what is the most given subtree sum. (a subtree always goes as far down as possible)
    public static <T extends Number> List<T> most_Frequent_Subtree_Sum(BinaryTreeNode<T> headNode){
        List<T> result = new ArrayList<>();
        HashMap<T, Integer> hashMap = new HashMap<>();
        checkNode(hashMap, headNode);
        Integer maxTimesGiven = -1;
        for(Integer i : hashMap.values()){
            if(i > maxTimesGiven){
                maxTimesGiven = i;
            }
        }
        for(T item : hashMap.keySet()){
            if(hashMap.get(item).equals(maxTimesGiven)){
                result.add(item);
            }
        }
        return result;
    }

    private static <T extends Number> T checkNode(HashMap<T, Integer> hashMap, BinaryTreeNode<T> node){
        T sum = sum(node.value, subtraction(node.value, node.value));
        if(node.rightBranch != null){
            sum = sum(sum, checkNode(hashMap, node.rightBranch));
        }
        if(node.leftBranch != null){
            sum = sum(sum, checkNode(hashMap, node.leftBranch));
        }
        if(hashMap.containsKey(sum)){
            hashMap.put(sum, hashMap.get(sum)+1);
        } else{
            hashMap.put(sum, 1);
        }
        return sum;
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

    private static <T extends Number> T subtraction(T nr1, T nr2){
        if(nr1 instanceof Float){
            return (T)(Number) (nr1.floatValue() - nr2.floatValue());
        } else if(nr1 instanceof Double){
            return (T)(Number) (nr1.doubleValue() - nr2.doubleValue());
        } else if(nr1 instanceof Integer){
            return (T)(Number) (nr1.intValue() - nr2.intValue());
        } else if(nr1 instanceof Long){
            return (T)(Number) (nr1.longValue() - nr2.longValue());
        } else if(nr1 instanceof Byte){
            return (T)(Number) (nr1.byteValue() - nr2.byteValue());
        } else if(nr1 instanceof Short){
            return (T)(Number) (nr1.shortValue() - nr2.shortValue());
        }
        return null;
    }
}
