package Easy.Counting_Bits_338;

/**
 * @author YQHP-YuKi
 * @create 2021-10-09 10:51
 */
public class Solution2 {

  public int[] countBits(int n) {
    int[] result = new int[n + 1];
    int bit = 0;
    for (int i = 1; i <= n; i++) {
      //judge the number whether is power of two
      if ((i & (i - 1)) == 0) {
        bit = i;
      }
      //the main code
      result[i] = result[i - bit] + 1;
    }
    return result;
  }
}
