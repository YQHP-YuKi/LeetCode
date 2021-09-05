package Easy.Pascals_Triangle_II_119;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YQHP-YuKi
 * @create 2021-09-05 9:13
 */
public class Solution1 {

  public List<Integer> getRow(int rowIndex) {
    ArrayList<List<Integer>> lists = new ArrayList<>();
    //this question example rowIndex = 3,[1,3,3,1].So the answer is the line 4,we should plus
    for (int i = 0; i < rowIndex + 1; i++) {
      ArrayList<Integer> arrayList = new ArrayList<>();
      for (int j = 0; j <= i; j++) {
        if (j == 0 || j == i) {
          arrayList.add(1);
        } else {
          arrayList.add(lists.get(i - 1).get(j - 1) + lists.get(i - 1).get(j));
        }
      }
      lists.add(arrayList);
    }
    //get the answer
    return lists.get(rowIndex);
  }
}
