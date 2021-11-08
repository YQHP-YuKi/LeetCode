package Medium.Combination_Sum_39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author YQHP-YuKi
 * @create 2021-11-08 9:15
 */
public class Solution1 {

  /**
   * define a global traversal for easy return
   */
  List<List<Integer>> result;

  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    //sort the array first,convenient for backtracking,otherwise errors may occur
    Arrays.sort(candidates);
    result = new ArrayList<>();
    //start backtracking
    backTracking(new ArrayList<>(), candidates, 0, target);
    return result;
  }

  /**
   * backtracking function
   */
  private void backTracking(List<Integer> path, int[] candidates, int start, int remain) {
    //if the result of addition is equals to target,just return
    if (remain == 0) {
      result.add(new ArrayList<Integer>(path));
      return;
    }
    //begin from the head of the array
    for (int i = start; i < candidates.length; i++) {
      if (candidates[i] > remain) {
        return;
      }
      //the main step of backtracking function
      //add the element
      path.add(candidates[i]);
      backTracking(path, candidates, i, remain - candidates[i]);
      //this is the most important step of backtracking,return the previous state
      path.remove(path.size() - 1);
    }
  }
}
