package DataStructures;

import java.util.ArrayList;

public class BinaryTree {

    public Node[] nodeArray;
    public ArrayList<Node> nodeArrayList = new ArrayList<Node>();

    public static void main(String[] args) {

    }

    public void createBinaryTree(Node[] nodeArray) {

    }

    public BinaryTree(int length) {
        nodeArray = new Node[length];
    }

    public void addChild() {

    }

    public boolean getHasLeftChild(Node[] nodes) {
        return getLeftNode(nodes, nodes.length - 1) == null;
    }

    public boolean getHasRightChild(Node[] nodes) {
        return getRightNode(nodes, nodes.length - 1) == null;
    }

    // returns parent node of the node at the inputted index
    public Node getParentNode(Node[] nodeArray, int index) {
        Node parentNode = nodeArray[index / 2];
        return parentNode;
    }

    // returns left child node of the node at the inputted index
    public Node getLeftNode(Node[] nodeArray, int index) {
        return nodeArray[2 * index];
    }

    // returns right child node of the node at the inputted index
    public Node getRightNode(Node[] nodeArray, int index) {
        return nodeArray[(2 * index) + 1];
    }

}