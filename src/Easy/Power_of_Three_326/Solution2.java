package Easy.Power_of_Three_326;

/**
 * @author YQHP-YuKi
 * @create 2021-10-07 11:10
 */
public class Solution2 {

  public boolean isPowerOfThree(int n) {
    return n > 0 && 1162261467 % n == 0;
  }
}
