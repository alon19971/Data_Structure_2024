package BinaryTree;

public class BinNode<T> {
    private T data;               // Data held by the node
    private BinNode<T> left;      // Pointer to the left child
    private BinNode<T> right;     // Pointer to the right child

    // Constructor to create a new node with data
    public BinNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    // Constructor to create a new node with data, left child, and right child
    public BinNode(T data, BinNode<T> left, BinNode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    // Getters and setters
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BinNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinNode<T> left) {
        this.left = left;
    }

    public BinNode<T> getRight() {
        return right;
    }

    public void setRight(BinNode<T> right) {
        this.right = right;
    }

    // Method to check if the node is a leaf
    public boolean isLeaf() {
        return (left == null && right == null);
    }
}

