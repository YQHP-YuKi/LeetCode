package Easy.Counting_Bits_338;

/**
 * @author YQHP-YuKi
 * @create 2021-10-07 11:34
 */
public class Solution1 {

  public int[] countBits(int n) {
    //make the result array
    int[] result = new int[n + 1];
    //result[0] default is 0
    for (int i = 1; i <= n; i++) {
      //record the current number
      int j = i;
      //calculate the number of 1
      int a = i;
      int count = 0;
      while (a != 0) {
        a = a & (a - 1);
        count++;
      }
      //record into array
      result[j] = count;
    }
    return result;
  }
}
