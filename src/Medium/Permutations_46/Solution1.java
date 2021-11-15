package Medium.Permutations_46;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YQHP-YuKi
 * @create 2021-11-14 9:43
 */
public class Solution1 {

  List<List<Integer>> result = new ArrayList<>();
  ArrayList<Integer> rls = new ArrayList<Integer>();

  public List<List<Integer>> permute(int[] nums) {
    backTracking(nums);
    return result;
  }

  private void backTracking(int[] array) {
    //find reaching the end,just add the rls into the result
    if (rls.size() == array.length) {
      result.add(new ArrayList<Integer>(rls));
      return;
    }
    for (int i = 0; i < array.length; i++) {
      //if the number had been added,just continue
      if (!rls.contains(array[i])) {
        //add the number into the rls
        rls.add(array[i]);
        backTracking(array);
        //the main code,just meaning backtracking,revocation processing node
        rls.remove(rls.size() - 1);
      }
    }
  }
}
