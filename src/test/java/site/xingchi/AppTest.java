package site.xingchi;


import org.junit.Test;
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
    public void startWithStr(){
        String str="xingchi";
        String str1="xi";
        boolean b = str.startsWith(str1);
        System.out.println(b);
    }
}
