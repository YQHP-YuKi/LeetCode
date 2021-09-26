package Easy.Add_Digits_258;

/**
 * @author YQHP-YuKi
 * @create 2021-09-26 10:54
 */
public class Solution1 {

  public int addDigits(int num) {
    int result = 0;
    while (num > 0) {
      //get every digit
      result += num % 10;
      num /= 10;
      //if num is 38,so result is 11,we need to update the num and the result
      if (num == 0 && result > 9) {
        num = result;
        result = 0;
      }
    }
    return result;
  }
}
