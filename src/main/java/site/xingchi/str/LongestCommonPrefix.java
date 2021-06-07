package site.xingchi.str;

/**
 * @author itcolors
 * @version 1.0
 * @date 2021/6/7 3:27 下午
 * @description 查找最长公共前缀
 */
public class LongestCommonPrefix {

    /**
     * 方法1
     * @param strs
     * @return
     */
    public String findLongestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String common = strs[0];
        for (int i = 1; i < strs.length; i++) {
            common = findLongCommonPrefix(strs[i], common);
            if(common.length()==0){
                break;
            }
        }
        return common;
    }

    private String findLongCommonPrefix(String s1, String s2) {
        int length = Math.min(s1.length(), s2.length());
        int index = 0;
        while (index < length && s1.charAt(index) == s2.charAt(index)) {
            index++;
        }
        return s1.substring(0, index);
    }
    //===================================================================

    /**
     * 方法2
     */


}
