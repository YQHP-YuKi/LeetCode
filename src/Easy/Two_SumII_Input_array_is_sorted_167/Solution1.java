package Easy.Two_SumII_Input_array_is_sorted_167;

import java.util.HashMap;

/**
 * @author YQHP-YuKi
 * @create 2021-09-08 8:50
 */
public class Solution1 {

  public int[] twoSum(int[] numbers, int target) {
    //make a result array
    int[] result = new int[2];
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < numbers.length; i++) {
      if (map.containsKey(target - numbers[i]) && i != map.get(target - numbers[i])) {
        //change the order in result
        result[0] = map.get(target - numbers[i]) + 1;
        result[1] = i + 1;
        break;
      }
      //put the number in HashMap
      map.put(numbers[i], i);
    }
    //just return
    return result;
  }
}
