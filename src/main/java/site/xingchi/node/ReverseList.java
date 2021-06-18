package site.xingchi.node;

import java.util.Stack;

/**
 * @author xingchi -->> itcolors <<----
 * @version 1.0
 * @date 2021/6/18 11:01
 * @description 反转链表
 */
public class ReverseList {
    public Node head;
    public Node end;


    /**
     * @author -->> itcolors <<----
     * @time 11:05
     * @description 创建链表
     */
    public ReverseList createList(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            end = newNode;
        } else {
            end.next = newNode;
            end = newNode;
        }
        return this;
    }

    /**
     * @author -->> itcolors <<----
     * @time 11:06
     * @description 打印链表
     */
    public void printList(Node head) {
        /*if(head==null){
            System.out.println("NULL");
            return;
        }*/
        while (head != null) {
            System.out.print(head.val + "=>");
            head = head.next;
        }
        System.out.print("NULL");
    }

    /**
     * @author -->> itcolors <<----
     * @time 11:13
     * @description 反转链表 方法1
     */
    public Node reverseList(Node head) {
        if (head == null) {
            return null;
        }
        Node pre = null;
        Node next = null;

        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    /**
     * @author -->> itcolors <<----
     * @time 11:39
     * @description 方法2 通过栈进行链表的反转
     */
    public Node reverseLinkList(Node head) {
        if (head == null) {
            return null;
        }
        Stack<Node> nodes = new Stack<>();
        while (head != null) {
            nodes.push(head);
            head = head.next;
        }

        Node currentNode = nodes.pop();
        Node result = currentNode;
        while (!nodes.isEmpty()) {
            Node temp = nodes.pop();
            currentNode.next = temp;
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        return result;
    }
}
