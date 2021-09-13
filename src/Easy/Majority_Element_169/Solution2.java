package Easy.Majority_Element_169;

/**
 * @author YQHP-YuKi
 * @create 2021-09-13 17:18
 */
public class Solution2 {

  public int majorityElement(int[] nums) {
    //count the most number
    int result = 0;
    //get the new number
    int ticket = 0;
    for (int num : nums) {
      //if A number is equals to B number,the result is 0
      if (result == 0) {
        ticket = num;
      }
      //judge which is the most number
      result += (num == ticket) ? +1 : -1;
    }
    return ticket;
  }
}
