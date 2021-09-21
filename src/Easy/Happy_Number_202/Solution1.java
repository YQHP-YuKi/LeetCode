package Easy.Happy_Number_202;

import java.util.HashSet;

/**
 * @author YQHP-YuKi
 * @create 2021-09-15 10:02
 */
public class Solution1 {

  public boolean isHappy(int n) {
    //make a HashSet
    HashSet<Integer> hashSet = new HashSet<>();
    //if n not 1 and n not repeat,just continue count
    while (n != 1 && !hashSet.contains(n)) {
      hashSet.add(n);
      n = count(n);
    }
    //judge whether n is 1
    return n == 1;
  }

  /**
   * to count the next number
   */
  private int count(int n) {
    int result = 0;
    while (n > 0) {
      int i = n % 10;
      result += i * i;
      n /= 10;
    }
    return result;
  }
}
