package Easy.Climbing_Stairs_70;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/16 15:18
 */
public class Solution1 {

  public int climbStairs(int n) {
    //p is stair0,q is stair1,result is sum of two stairs
    int p = 0, q = 1, result = 0;
    //result is 1,2,3,4...
    for (int i = 0; i < n; i++) {
      result = p + q;
      p = q;
      q = result;
    }
    return result;
  }
}
