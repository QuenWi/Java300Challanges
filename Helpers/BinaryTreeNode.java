package Helpers;

public class BinaryTreeNode<T> {
    public T value;
    public BinaryTreeNode<T> rightBranch;
    public BinaryTreeNode<T> leftBranch;

    public BinaryTreeNode(T value) {
        this.value = value;
        rightBranch = null;
        leftBranch = null;
    }

    public BinaryTreeNode(T value, BinaryTreeNode<T> rightBranch, BinaryTreeNode<T> leftBranch) {
        this.value = value;
        this.rightBranch = rightBranch;
        this.leftBranch = leftBranch;
    }
}
