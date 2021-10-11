package Easy.Valid_Perfect_Square_367;

/**
 * @author YQHP-YuKi
 * @create 2021-10-11 9:41
 */
public class Solution1 {

  public boolean isPerfectSquare(int num) {
    //1 is true
    if (num == 1) {
      return true;
    }
    //use long to store the calculation result
    long head = 2, tail = num;
    while (head <= tail) {
      long mid = head + (tail - head) / 2;
      if (mid * mid > num) {
        tail = mid - 1;
      } else if (mid * mid < num) {
        head = mid + 1;
      } else {
        return true;
      }
    }
    return false;
  }
}
