package Easy.Longest_Common_Prefix_14;

import java.util.Arrays;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/06 17:01
 */
public class Solution1 {

  public String longestCommonPrefix(String[] strs) {
    //First strs:"flower","fsdsda","fl"
    Arrays.sort(strs);
    //Now strs:"fl","flower","fsdsda"
    char[] array1 = strs[0].toCharArray();
    char[] array2 = strs[strs.length - 1].toCharArray();
    int i = 0;
    while (i < array1.length && i < array2.length) {
      if (array1[i] != array2[i]) {
        break;
      }
      i++;
    }
    return strs[0].substring(0, i);
  }
}
