package DataStructures;

/**
 * Created by Shreyas Niradi on 12/29/2016.
 */

public class Node {

    Object object;

    public static void main(String[] args) {
        Node node = new Node("potato");
    }

    // Node constructors
    public Node(Object object) {
        this.object = object;
    }

    public boolean isParentNode() {
        return false;
    }

    public int getNodeDegree() {
        int degree = 0;
        return degree;
    }

    public void getNodeDepth() {

    }

    public void getNodeHeight() {
    }

    public boolean isLeafNode() {
        return false;
    }

    public boolean isSiblingNode(Node one, Node two) {
        return false;
    }
}
