package Easy.Contains_Duplicate_217;

import java.util.HashSet;

/**
 * @author YQHP-YuKi
 * @create 2021-09-18 9:52
 */
public class Solution2 {

  public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> hashSet = new HashSet<>();
    for (int num : nums) {
      //if the num has been existed,it will return false
      if (!hashSet.add(num)) {
        return true;
      }
    }
    return false;
  }
}
