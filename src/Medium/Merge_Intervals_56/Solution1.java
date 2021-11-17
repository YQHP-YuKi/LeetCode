package Medium.Merge_Intervals_56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author YQHP-YuKi
 * @create 2021-11-2021/11/16 3:14 下午
 */
public class Solution1 {

  public int[][] merge(int[][] intervals) {
    //the special situation
    if (intervals.length == 1) {
      return intervals;
    }
    //override the sort function
    Arrays.sort(intervals, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        return o1[0] - o2[0];
      }
    });
    //because we don't know how long the result will be,so we use arraylist
    ArrayList<int[]> list = new ArrayList<>();
    //set a slow pointer
    int[] current_interval = intervals[0];
    //and add it at first,if don't add it,we will miss the first of the result array
    list.add(current_interval);
    //traverse the array
    for (int[] interval : intervals) {
      //because we don't need to judge the current[0],we just need to judge the current[1],so we
      // don't need this step
      //int current_begin = current_interval[0];
      int current_end = current_interval[1];
      //the faster pointer
      int next_begin = interval[0];
      int next_end = interval[1];
      //merge the two arrays to be a new result array
      if (current_end >= next_begin) {
        current_interval[1] = Math.max(current_end, next_end);
      } else {
        //we just need to update the two pointers
        current_interval = interval;
        list.add(current_interval);
      }
    }
    return list.toArray(new int[list.size()][]);
  }
}
