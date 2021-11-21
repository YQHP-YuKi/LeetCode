package Medium.Insert_Interval_57;

import java.util.ArrayList;

/**
 * @author YQHP-YuKi
 * @create 2021-11-2021/11/19 8:38 上午
 */
public class Solution1 {

  public int[][] insert(int[][] intervals, int[] newInterval) {
    //we don't know how long the result will be,so use arraylist to store
    ArrayList<int[]> list = new ArrayList<>();
    //special situation
    if (intervals.length == 0 && intervals == null) {
      list.add(newInterval);
      return list.toArray(new int[list.size()][]);
    }
    //traversal the intervals
    for (int[] interval : intervals) {
      //situation1,interval < new
      if (interval[1] < newInterval[0]) {
        list.add(interval);
      } else if (newInterval[1] < interval[0]) {
        //situation2,new < interval
        list.add(newInterval);
        newInterval = interval;
      } else {
        //situation3,merge the two arrays into a new array
        newInterval[0] = Math.min(interval[0], newInterval[0]);
        newInterval[1] = Math.max(interval[1], newInterval[1]);
      }
    }
    //if we don't add it at last,we will lose the last answer of array
    list.add(newInterval);
    return list.toArray(new int[list.size()][]);
  }
}
