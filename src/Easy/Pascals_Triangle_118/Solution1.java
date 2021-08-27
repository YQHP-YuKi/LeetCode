package Easy.Pascals_Triangle_118;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/27 17:51
 */
public class Solution1 {

  public List<List<Integer>> generate(int numRows) {
    ArrayList<List<Integer>> lists = new ArrayList<>();
    for (int i = 0; i < numRows; i++) {
      ArrayList<Integer> arrayList = new ArrayList<Integer>();
      for (int j = 0; j <= i; j++) {
        //the head and tail must be 1
        if (j == 0 || j == i) {
          arrayList.add(1);
        } else {
          //[i-1][j-1]+[i-1][J]
          arrayList.add(lists.get(i - 1).get(j - 1) + lists.get(i - 1).get(j));
        }
      }
      //add this new lists
      lists.add(arrayList);
    }
    return lists;
  }
}
