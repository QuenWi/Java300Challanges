package Binary_Tree_Vertical_Order_Traversal;

import Helpers.BinaryTreeNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Binary_Tree_Vertical_Order_Traversal {

    static int counter = 0;

    //Returns the elements of a binary tree in vertical order traversal
    public static <T> List<T> binary_Tree_Vertical_Order_Traversal(BinaryTreeNode<T> headNode){
        List<T> result = new ArrayList<>();
        List<TreeData<T>> nodData = new ArrayList<>();
        goThroughNods(nodData, headNode, 0, 0);
        nodData.sort(new Comparator<TreeData<T>>() {
            @Override
            public int compare(TreeData<T> o1, TreeData<T> o2) {
                int firstCompare = Integer.compare(o1.verticalPos, o2.verticalPos);
                if(firstCompare == 0){
                    int secondCompare = Integer.compare(o1.horizontalPos, o2.horizontalPos);
                    if(secondCompare == 0){
                        return Integer.compare(o1.counter, o2.counter);
                    }
                    return secondCompare;
                }
                return firstCompare;
            }
        });
        for(TreeData<T> treeData : nodData){
            result.add(treeData.value);
        }
        return result;
    }

    private static <T> void goThroughNods(List<TreeData<T>> nodData, BinaryTreeNode<T> node, int verticalPos, int horizontalPos){
        nodData.add(new TreeData<T>(node.value, verticalPos, horizontalPos, counter));
        counter++;
        if(node.leftBranch != null){
            goThroughNods(nodData, node.leftBranch, verticalPos-1, horizontalPos+1);
        }
        if(node.rightBranch != null){
            goThroughNods(nodData, node.rightBranch, verticalPos+1, horizontalPos+1);
        }
    }

    private static class TreeData<T>{
        T value;
        int verticalPos;
        int horizontalPos;
        int counter;

        public TreeData(T value, int verticalPos, int horizontalPos, int counter) {
            this.value = value;
            this.verticalPos = verticalPos;
            this.horizontalPos = horizontalPos;
            this.counter = counter;
        }
    }
}
