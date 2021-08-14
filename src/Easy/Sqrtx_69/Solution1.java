package Easy.Sqrtx_69;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/14 17:20
 */
public class Solution1 {

  public int mySqrt(int x) {
    int head = 0, tail = x, result = 0;
    while (head <= tail) {
      int mid = head + (tail - head) / 2;
      //such as 3*3=9,2*2<9
      if ((long) mid * mid <= x) {
        //to record last mid
        result = mid;
        head = mid + 1;
      } else {
        tail = mid - 1;
      }
    }
    return result;
  }
}
