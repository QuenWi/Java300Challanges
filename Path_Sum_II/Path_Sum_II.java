package Path_Sum_II;

import Helpers.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

public class Path_Sum_II {

    //Returns all paths, which are equal to the sum. (top down only)
    public static <T extends Number> List<List<T>> path_Sum_II(BinaryTreeNode<T> headNode, T wantedSum){
        List<List<T>> result = new ArrayList<>();
        controlNode(result, headNode, wantedSum, new ArrayList<>());
        return result;
    }

    private static <T extends Number> void controlNode(List<List<T>> result, BinaryTreeNode<T> node, T wantedSum, List<List<T>> givenSums){
        List<List<T>> newGivenSums = new ArrayList<>();
        for(List<T> list : givenSums){
            List<T> newGivenSum = new ArrayList<>();
            for(T element : list){
                newGivenSum.add(element);
            }
            newGivenSum.add(node.value);
            newGivenSums.add(newGivenSum);
        }
        List<T> newGivenSum = new ArrayList<>();
        newGivenSum.add(node.value);
        newGivenSums.add(newGivenSum);

        for(List<T> list : newGivenSums){
            if(controlSum(list, wantedSum)){
                result.add(list);
            }
        }
        if(node.leftBranch != null){
            controlNode(result, node.leftBranch, wantedSum, newGivenSums);
        }
        if(node.rightBranch != null){
            controlNode(result, node.rightBranch, wantedSum, newGivenSums);
        }
    }

    private static <T extends Number> boolean controlSum(List<T> list, T wantedSum){
        T sum = subtraction(list.get(0), list.get(0));
        for(T element : list){
            sum = sum(sum, element);
        }
        if(sum.equals(wantedSum)){
            return true;
        }
        return false;
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
