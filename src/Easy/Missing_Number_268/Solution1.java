package Easy.Missing_Number_268;

/**
 * @author YQHP-YuKi
 * @create 2021-10-05 10:16
 */
public class Solution1 {

  public int missingNumber(int[] nums) {
    //calculate the synthesis of all the elements
    int n = (1 + nums.length) * nums.length / 2;
    //minus all the elements
    for (int num : nums) {
      n -= num;
    }
    return n;
  }
}
