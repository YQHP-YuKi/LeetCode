package Easy.Summary_Ranges_228;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YQHP-YuKi
 * @create 2021-09-20 17:11
 */
public class Solution1 {

  public List<String> summaryRanges(int[] nums) {
    ArrayList<String> strings = new ArrayList<>();
    int i = 0;
    while (i < nums.length) {
      //compare i with each j
      int j = i + 1;
      while (j < nums.length && nums[j] - nums[j - 1] == 1) {
        j++;
      }
      //start from i
      StringBuffer buffer = new StringBuffer(Integer.toString(nums[i]));
      //if just a single number,just need like this "7",else end to j-1
      if (i < j - 1) {
        buffer.append("->");
        buffer.append(Integer.toString(nums[j - 1]));
      }
      //update i location
      i = j;
      strings.add(buffer.toString());
    }
    return strings;
  }
}
