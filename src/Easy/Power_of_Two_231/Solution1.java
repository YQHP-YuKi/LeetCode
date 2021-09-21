package Easy.Power_of_Two_231;

/**
 * @author YQHP-YuKi
 * @create 2021-09-21 11:31
 */
public class Solution1 {

  public boolean isPowerOfTwo(int n) {
    //all impossible,just return false
    if (n < 1) {
      return false;
    }
    //special cases
    if (n == 1) {
      return true;
    }
    //ordinary number
    while (n > 1) {
      if (n % 2 != 0) {
        return false;
      }
      n /= 2;
    }
    return true;
  }
}
