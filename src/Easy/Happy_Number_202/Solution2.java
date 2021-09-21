package Easy.Happy_Number_202;

/**
 * @author YQHP-YuKi
 * @create 2021-09-15 10:02
 */
public class Solution2 {

  public boolean isHappy(int n) {
    //fast speed is two times slow
    int slow = n;
    int fast = count(n);
    //when they meet again
    while (fast != 1 && slow != fast) {
      slow = count(slow);
      fast = count(count(fast));
    }
    //judge whether fast is 1
    return fast == 1;
  }

  /**
   * to count the next number
   */
  private int count(int n) {
    int result = 0;
    while (n > 0) {
      int i = n % 10;
      result += i * i;
      n /= 10;
    }
    return result;
  }
}
