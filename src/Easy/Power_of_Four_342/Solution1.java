package Easy.Power_of_Four_342;

/**
 * @author YQHP-YuKi
 * @create 2021-10-09 11:30
 */
public class Solution1 {

  public boolean isPowerOfFour(int n) {
    if (n <= 0) {
      return false;
    }
    while (n > 1) {
      if (n % 4 == 0) {
        n /= 4;
      } else {
        return false;
      }
    }
    return true;
  }
}
