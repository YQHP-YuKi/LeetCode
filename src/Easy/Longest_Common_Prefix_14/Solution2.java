package Easy.Longest_Common_Prefix_14;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/06 17:15
 */
public class Solution2 {

  public String longestCommonPrefix(String[] strs) {
    //Special case
    if (strs.length == 0) {
      return "";
    }
    //the Common Prefix can't longer than the shortest string
    int StrsLength = strs.length;
    //to count the compare number
    int firstLength = strs[0].length();
    for (int i = 0; i < firstLength; i++) {
      char compare = strs[0].charAt(i);
      for (int j = 1; j < StrsLength; j++) {
        //compare with each one of them
        if (i == strs[j].length() || compare != strs[j].charAt(i)) {
          return strs[0].substring(0, i);
        }
      }
    }
    return strs[0];
  }
}
