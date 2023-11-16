package Binary_Search_Tree_Iterator;

import Helpers.BinaryTreeNode;

public class Binary_Search_Tree_Iterator <T> {
    BinaryTreeNode<T> node;

    public Boolean hasNext(){
        if(node.leftBranch != null){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public T next(){
        node = node.leftBranch;
        return node.value;
    }

    public Binary_Search_Tree_Iterator(BinaryTreeNode<T> node) {
        this.node = node;
    }
}
