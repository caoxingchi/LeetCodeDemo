package site.xingchi.node;

public class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }

    public Node() {
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}
