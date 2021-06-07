package site.xingchi.node;

public class Link {

    public Node head;
    public Node end;

    /**
     * 创建链表 链式编程
     *
     * @param val
     * @return
     */
    public Link createLink(int val) {
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
     * 打印链表
     */
    public void printLink(Node node) {
        //首先判断该链表是否为空
        if (node == null) {
            System.out.print("null");
            return;
        }
        //不为空的时候该如何处理
        while (node != null) {
            System.out.print(node.val + "-->");
            node = node.next;
        }
        System.out.println("null");
    }

    /**
     * @param l1 链表1 头结点
     * @param l2 链表2 头结点
     * @return 1->2->3  321
     * 9->1  19
     */
    public Node addTwoNumbers(Node l1, Node l2) {
        Node newNode = new Node(0);
        Node current = newNode;
        int left = 0;
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        //当两个表都不为空时
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + left;
            left = (sum - 9) > 0 ? 1 : 0;
            l1.val = sum > 9 ? sum - 10 : sum;
            current.next = l1;
            l1 = l1.next;
            l2 = l2.next;
            current = current.next;
        }
        //当l1表为空的时候  就将l2表的数据进行处理
        if (l1 == null) {
            while (l2 != null) {
                int sum = l2.val + left;
                left = (sum - 9) > 0 ? 1 : 0;
                l2.val = sum > 9 ? sum - 10 : sum;
                current.next = l2;
                l2 = l2.next;
                current = current.next;
            }

        }

        if (l2 == null) {
            while (l1 != null) {
                int sum = l1.val + left;
                left = (sum - 9) > 0 ? 1 : 0;
                l1.val = sum > 9 ? sum - 10 : sum;
                current.next = l1;
                l1 = l1.next;
                current = current.next;
            }

        }

        if (left > 0) {
            current.next = new Node(left);
        }
        return newNode.next;
    }

    /**
     * 两个链表相加的优化
     *
     * @param l1
     * @param l2
     * @return
     */
    public Node addNumbers(Node l1, Node l2) {
        Node head = null, end = null;
        int left = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + left;
            left = sum > 9 ? 1 : 0;
            if (head == null) {
                head = end = new Node(sum % 10);
            } else {
                end.next = new Node(sum % 10);
                end = end.next;
            }
            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }

        }
        if (left > 0) {
            end.next = new Node(left);
        }
        return head;
    }

}
