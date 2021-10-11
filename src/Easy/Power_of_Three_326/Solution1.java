package Easy.Power_of_Three_326;

/**
 * @author YQHP-YuKi
 * @create 2021-10-07 11:00
 */
public class Solution1 {

  public boolean isPowerOfThree(int n) {
    if (n <= 0) {
      return false;
    }
    while (n > 1) {
      if (n % 3 == 0) {
        n /= 3;
      } else {
        return false;
      }
    }
    return true;
  }
}
