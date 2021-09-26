package Easy.Add_Digits_258;

/**
 * @author YQHP-YuKi
 * @create 2021-09-26 11:20
 */
public class Solution2 {

  public int addDigits(int num) {
    if (num == 0) {
      return 0;
    }
    if (num % 9 == 0) {
      return 9;
    } else {
      return num %= 9;
    }
  }
}
