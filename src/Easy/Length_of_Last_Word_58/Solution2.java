package Easy.Length_of_Last_Word_58;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/13 16:53
 */
public class Solution2 {

  public int lengthOfLastWord(String s) {
    int end = s.length() - 1;
    int start;
    //find the word tail
    while (end >= 0 && s.charAt(end) == ' ') {
      end--;
    }
    //if have no word
    if (end < 0) {
      return 0;
    }
    //begin from the tail
    start = end;
    //find the head
    while (start >= 0 && s.charAt(start) != ' ') {
      start--;
    }
    return end - start;
  }
}
