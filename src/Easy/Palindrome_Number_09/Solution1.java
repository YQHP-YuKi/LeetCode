package Easy.Palindrome_Number_09;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/06 15:19
 */
public class Solution1 {

  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    int result = 0, x1 = x;
    while (x != 0) {
      int temp = x % 10;
      if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && temp > 7)) {
        return false;
      }
      result = result * 10 + temp;
      x /= 10;
    }
    if (result == x1) {
      return true;
    } else {
      return false;
    }
  }
}
