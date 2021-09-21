package Easy.Factorial_Trailing_Zeroes_172;

/**
 * @author YQHP-YuKi
 * @create 2021-09-14 14:47
 */
public class Solution1 {

  public int trailingZeroes(int n) {
    int count = 0;
    while (n > 0) {
      //just divide by 5
      n /= 5;
      //count is the quotient
      count += n;
    }
    return count;
  }
}
