package Closest_Binary_Search_Tree_Value;

import Helpers.BinaryTreeNode;

public class Closest_Binary_Search_Tree_Value {

    //what is the clostest element of an element in a tree?
    public static <T extends Number> T closest_Binary_Search_Tree_Value(BinaryTreeNode<T> headNode, T value){
        return compareNode(headNode, value, absolute(subtraction(value, headNode.value)), headNode.value);
    }

    private static <T extends Number> T compareNode(BinaryTreeNode<T> node, T value, T minDistance, T currentResult){
        if(compare(absolute(subtraction(value, node.value)), minDistance)){
            currentResult = node.value;
            minDistance = absolute(subtraction(value, node.value));
        }
        if(currentResult.equals(value)){
            return currentResult;
        }  else{
            if(compare(node.value, value)){
                if(node.rightBranch != null){
                    return compareNode(node.rightBranch,  value, minDistance, currentResult);
                }
            } else{
                if(node.leftBranch != null){
                    return compareNode(node.leftBranch,  value, minDistance, currentResult);
                }
            }
        }
        return currentResult;
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

    private static <T extends Number> T absolute(T nr){
        if(nr instanceof Float){
            return (T)(Number) (Math.abs(nr.floatValue()));
        } else if(nr instanceof Double){
            return (T)(Number) (Math.abs(nr.doubleValue()));
        } else if(nr instanceof Integer){
            return (T)(Number) (Math.abs(nr.intValue()));
        } else if(nr instanceof Long){
            return (T)(Number) (Math.abs(nr.longValue()));
        } else if(nr instanceof Byte){
            return (T)(Number) (Math.abs(nr.byteValue()));
        } else if(nr instanceof Short){
            return (T)(Number) (Math.abs(nr.shortValue()));
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
