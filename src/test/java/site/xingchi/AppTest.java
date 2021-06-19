package site.xingchi;


import org.junit.Test;
import site.xingchi.node.Link;
import site.xingchi.node.Node;
import site.xingchi.node.ReverseList;
import site.xingchi.str.LongestCommonPrefix;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        System.out.println("test");
    }


    @Test
    public void splitStr() {
        String str = "xingchi";
        String[] a = str.split("");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    /**
     * 求最长公共前缀
     */
    @Test
    public void findCommon(){
        String [] strs={"xingchi","xingcasas","xin","xingchi1"};
        LongestCommonPrefix longestCommonPrefix=new LongestCommonPrefix();
        String common=longestCommonPrefix.findLongestCommonPrefix(strs);
        System.out.println(common);
    }

    @Test
    public void strIndexOf(){
        String str="xingchi";
        String str1="xingc";
        int i = str.indexOf(str1);
        System.out.println(i);
    }

    @Test
    public void startWithStr() {
        String str = "xingchi";
        String str1 = "xi";
        boolean b = str.startsWith(str1);
        System.out.println(b);
    }

    /**
     * @author -->> itcolors <<----
     * @time 11:31
     * @description 反转链表测试
     */
    @Test
    public void createList() {
        ReverseList list = new ReverseList();
        list.createList(12).createList(13).createList(35);
        list.printList(list.head);
    }

    @Test
    public void reverseList() {
        ReverseList list = new ReverseList();
        list.createList(12).createList(13).createList(35);
        list.printList(list.head);
        System.out.println();
        Node node = list.reverseList(list.head);
        list.printList(node);
    }

    @Test
    public void reverseLinkList() {
        ReverseList list = new ReverseList();
        list.createList(12).createList(13).createList(35);
        list.printList(list.head);
        System.out.println();
        Node node = list.reverseLinkList(list.head);
        list.printList(node);
    }

    @Test
    public void deleteList() {
        Link deleteLink = new Link();
        deleteLink.createLink(12).createLink(19).createLink(80).createLink(90);
        deleteLink.printLink(deleteLink.head);
        System.out.println("==============");

        Node newNode = deleteLink.deleteNthFromList(deleteLink.head, 5);
        deleteLink.printLink(newNode);

    }
}
