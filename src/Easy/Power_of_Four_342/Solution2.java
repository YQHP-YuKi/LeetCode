package Easy.Power_of_Four_342;

/**
 * @author YQHP-YuKi
 * @create 2021-10-09 11:37
 */
public class Solution2 {

  public boolean isPowerOfFour(int n) {
    return n > 0 && (n & (n - 1)) == 0 && n % 3 == 1;
  }
}
