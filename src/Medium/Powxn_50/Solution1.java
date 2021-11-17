package Medium.Powxn_50;

/**
 * @author YQHP-YuKi
 * @create 2021-11-2021/11/16 10:11 上午
 */
public class Solution1 {

  public double myPow(double x, int n) {
    return n > 0 ? recursion(x, n) : 1 / recursion(x, -n);
  }

  /**
   * the function of recursion
   */
  private double recursion(double x, int y) {
    //the condition for the end of recursion
    if (y == 0) {
      return 1.0;
    }
    double result = recursion(x, y / 2);
    //judge whether the even or the odd
    return y % 2 == 0 ? result * result : result * result * x;
  }
}
