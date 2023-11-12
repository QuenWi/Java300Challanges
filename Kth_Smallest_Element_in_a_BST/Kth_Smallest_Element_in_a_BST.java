package Kth_Smallest_Element_in_a_BST;

import Helpers.BinaryTreeNode;
import Helpers.BinaryTreeNode_AsList;

import java.util.Comparator;
import java.util.List;

public class Kth_Smallest_Element_in_a_BST {

    //get the Kths smalest element inside a binary tree
    public static <T extends Number> T kth_Smallest_Element_in_a_BST(BinaryTreeNode<T> headNode, Integer kThSmallestNumber){
        List<T> values = BinaryTreeNode_AsList.binaryTreeNode_AsList(headNode);
        for(int i = 0; i < values.size(); i++){
            if(values.get(i) == null){
                values.remove(i);
                i--;
            }
        }
        values.sort(comparator(headNode.value));
        return values.get(kThSmallestNumber);
    }

    private static <T extends Number> Comparator<T> comparator(T nr1){
        if(nr1 instanceof Float){
            return new Comparator<T>() {
                @Override
                public int compare(T o1, T o2) {
                    return Float.compare(o1.floatValue(), o2.floatValue());
                }
            };
        } else if(nr1 instanceof Double){
            return new Comparator<T>() {
                @Override
                public int compare(T o1, T o2) {
                    return Double.compare(o1.doubleValue(), o2.doubleValue());
                }
            };
        } else if(nr1 instanceof Integer){
            return new Comparator<T>() {
                @Override
                public int compare(T o1, T o2) {
                    return Integer.compare(o1.intValue(), o2.intValue());
                }
            };
        } else if(nr1 instanceof Long){
            return new Comparator<T>() {
                @Override
                public int compare(T o1, T o2) {
                    return Long.compare(o1.longValue(), o2.longValue());
                }
            };
        } else if(nr1 instanceof Byte){
            return new Comparator<T>() {
                @Override
                public int compare(T o1, T o2) {
                    return Byte.compare(o1.byteValue(), o2.byteValue());
                }
            };
        } else if(nr1 instanceof Short){
            return new Comparator<T>() {
                @Override
                public int compare(T o1, T o2) {
                    return Short.compare(o1.shortValue(), o2.shortValue());
                }
            };
        }
        return null;
    }
}
