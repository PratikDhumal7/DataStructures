package domain;

public class Node {

    Node leftChild;
    Node rightChild;
    float data;

    public Node(float data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public float getData() {
        return data;
    }

    public void setData(float data) {
        this.data = data;
    }
}
