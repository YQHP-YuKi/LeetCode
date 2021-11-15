package Medium.Permutations_II_47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author YQHP-YuKi
 * @create 2021-11-14 10:24
 */
public class Solution1 {

  List<List<Integer>> result = new ArrayList<>();
  ArrayList<Integer> rls = new ArrayList<Integer>();

  public List<List<Integer>> permuteUnique(int[] nums) {
    //to avoid special situation,we should sort the nums first
    Arrays.sort(nums);
    boolean[] hadFound = new boolean[nums.length];
    backTracking(nums, hadFound);
    return result;
  }

  private void backTracking(int[] array, boolean[] hadFound) {
    //find reaching the end,just add the rls into the result
    if (rls.size() == array.length) {
      result.add(new ArrayList<Integer>(rls));
      return;
    }
    for (int i = 0; i < array.length; i++) {
      //if this number is finding,just continue
      if (hadFound[i]) {
        continue;
      }
      //If the elements are the same and the last one has been searched,so just continue
      if (i > 0 && array[i] == array[i - 1] && !hadFound[i - 1]) {
        continue;
      }
      rls.add(array[i]);
      hadFound[i] = true;
      backTracking(array, hadFound);
      //the main code,just meaning backtracking,revocation processing node,and let this number
      // become false
      hadFound[i] = false;
      rls.remove(rls.size() - 1);
    }
  }
}
