package Easy.Reverse_String_344;

/**
 * @author YQHP-YuKi
 * @create 2021-10-09 11:56
 */
public class Solution1 {

  public void reverseString(char[] s) {
    int head = 0, tail = s.length - 1;
    //swap the head and the tail,until they are meeting
    while (head <= tail) {
      char temp = s[head];
      s[head] = s[tail];
      s[tail] = temp;
      head++;
      tail--;
    }
  }
}
