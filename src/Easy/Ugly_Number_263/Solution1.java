package Easy.Ugly_Number_263;

/**
 * @author YQHP-YuKi
 * @create 2021-10-05 9:56
 */
public class Solution1 {

  public boolean isUgly(int n) {
    //n<=0 are all false
    if (n <= 0) {
      return false;
    }
    //n will become 1 at last
    while (n > 1) {
      if (n % 2 == 0) {
        n /= 2;
        continue;
      }
      if (n % 3 == 0) {
        n /= 3;
        continue;
      }
      if (n % 5 == 0) {
        n /= 5;
        continue;
      }
      //it's not ugly number
      if (n % 2 != 0 && n % 3 != 0 && n % 5 != 0) {
        return false;
      }
    }
    return true;
  }
}
