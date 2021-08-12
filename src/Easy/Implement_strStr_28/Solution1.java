package Easy.Implement_strStr_28;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/10 15:33
 */
public class Solution1 {

  public int strStr(String haystack, String needle) {
    //special case
    if (needle.length() == 0) {
      return 0;
    }
    int L1 = haystack.length();
    int L2 = needle.length();
    //if L1="aaa",L2="aaa",L1-L2 will be 0,so it is a special case
    if (L1 == L2) {
      if (haystack.equals(needle)) {
        return 0;
      } else {
        return -1;
      }
    }
    for (int i = 0; i <= L1 - L2; i++) {
      String str = haystack.substring(i, i + L2);
      if (str.equals(needle)) {
        return i;
      }
    }
    return -1;
  }
}
