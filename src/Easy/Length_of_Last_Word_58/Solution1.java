package Easy.Length_of_Last_Word_58;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/13 15:09
 */
public class Solution1 {

  public int lengthOfLastWord(String s) {
    //length is the tail,i is the head
    int i = s.length() - 1, length = 0;
    while (i >= 0) {
      //find the tail
      if (s.charAt(i) != ' ') {
        length = i;
        break;
      } else {
        i--;
      }
    }
    //find the head
    while (i >= 0) {
      if (s.charAt(i) == ' ') {
        break;
      } else {
        i--;
      }
    }
    //subtract the two
    return length - i;
  }
}
