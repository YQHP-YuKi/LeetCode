package Easy.Maximum_Subarray_53;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/12 16:52
 */
public class Solution1 {

  public int maxSubArray(int[] nums) {
    int sum = nums[0], result = 0;
    //traverse the array
    for (int num : nums) {
      if (result > 0) {
        //update the result
        result += num;
      } else {
        //if result<=0,get a new result
        result = num;
      }
      //save the maximum
      sum = Math.max(sum, result);
      //you can use this to Watch the whole process
      //System.out.println("sum :" + sum + " " + "result :" + result);
    }
    //get the max
    return sum;
  }
}
