package Easy.Plus_One_66;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/13 17:42
 */
public class Solution1 {

  public int[] plusOne(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i--) {
      //this letter plus 1
      digits[i]++;
      //judge this letter whether 9 or other number"0-8"
      digits[i] = digits[i] % 10;
      //if this letter is 9,so the next digit plus one,or not just return the new digits
      if (digits[i] != 0) {
        return digits;
      }
    }
    //if all letters are 9,the first letter must 1,"999" "1000"
    digits = new int[digits.length + 1];
    digits[0] = 1;
    return digits;
  }
}
