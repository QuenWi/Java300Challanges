package Binary_Tree_Maximum_Path_Sum;

import Helpers.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Maximum_Path_Sum {

    //what is the biggest sum of a path inside a tree.
    public static <T extends Number> T binary_Tree_Maximum_Path_Sum(BinaryTreeNode<T> headNode){
        List<T> result = new ArrayList<>();
        result.add(headNode.value);
        result.add(subtraction(headNode.value, headNode.value));
        controlTree(result, headNode);
        return result.get(0);
    }

    private static <T extends Number> T controlTree(List<T> result, BinaryTreeNode<T> node){
        T rightNodeSum = null;
        T leftNodeSum = null;
        T maxSumPath = null;
        if(node.leftBranch != null){
            rightNodeSum = controlTree(result, node.leftBranch);
        }
        if(node.rightBranch != null){
            leftNodeSum = controlTree(result,  node.rightBranch);
        }
        if(leftNodeSum != null && rightNodeSum != null){
            System.out.println(leftNodeSum.toString() + " " + rightNodeSum.toString());
            if(compare(result.get(1), rightNodeSum) && compare(result.get(1), leftNodeSum)){
                if(compare(result.get(0), sum(sum(rightNodeSum, leftNodeSum), node.value))){
                    result.set(0, sum(sum(rightNodeSum, leftNodeSum), node.value));
                }
            }
        }
        if(leftNodeSum != null){
            if(compare(result.get(1), sum(leftNodeSum, node.value))){
                maxSumPath = sum(leftNodeSum, node.value);
            }
        }
        if(rightNodeSum != null){
            if(compare(result.get(1), sum(rightNodeSum, node.value))){
                if(maxSumPath == null){
                    maxSumPath = sum(rightNodeSum, node.value);
                } else if(compare(leftNodeSum, rightNodeSum)){
                    maxSumPath = sum(rightNodeSum, node.value);
                }
            }
        }
        if(maxSumPath == null){
            maxSumPath = node.value;
        }
        if(compare(result.get(0), maxSumPath)){
            result.set(0, maxSumPath);
        }
        return maxSumPath;
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
