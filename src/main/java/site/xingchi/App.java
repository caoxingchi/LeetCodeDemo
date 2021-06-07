package site.xingchi;

import site.xingchi.node.Link;
import site.xingchi.node.Node;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Link l1=new Link();
        l1.createLink(9).createLink(2).createLink(1).createLink(9);
        l1.printLink(l1.head);

        Link l2=new Link();
        l2.createLink(1).createLink(2).createLink(9).createLink(1);
        l2.printLink(l2.head);

        //9129
        // 921
        //10050
        Link l3=new Link();
        long s1=System.nanoTime();
        Node node = l3.addNumbers(l1.head, l2.head);
        long s2=System.nanoTime();
        Node node1=l3.addTwoNumbers(l1.head,l2.head);
        long s3=System.nanoTime();

        l3.printLink(node);
        l3.printLink(node1);

        System.out.println("addNumbers耗时="+(s2-s1)+"ns");
        System.out.println("addTwoNumbers耗时="+(s3-s2)+"ns");

    }

}
