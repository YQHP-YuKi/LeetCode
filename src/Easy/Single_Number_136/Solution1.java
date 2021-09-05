package Easy.Single_Number_136;

/**
 * @author YQHP-YuKi
 * @create 2021-09-05 17:50
 */
public class Solution1 {

  public int singleNumber(int[] nums) {
    int number = 0;
    for (int num : nums) {
      number ^= num;
    }
    return number;
  }
}
