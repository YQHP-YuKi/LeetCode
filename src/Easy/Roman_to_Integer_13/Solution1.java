package Easy.Roman_to_Integer_13;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/06 15:43
 */
public class Solution1 {

  public int romanToInt(String s) {
    int result = 0;
    //count the first number to compare with the next number
    int temp = getValue(s.charAt(0));
    for (int i = 1; i < s.length(); i++) {
      int now = getValue(s.charAt(i));
      if (temp < now) {
        result -= temp;
      } else {
        result += temp;
      }
      temp = now;
    }
    //plus the last number at last
    result += temp;
    return result;
  }

  /**
   * make a switch method to judge the Roman number
   */
  private int getValue(char c) {
    switch (c) {
      case 'I':
        return 1;
      case 'V':
        return 5;
      case 'X':
        return 10;
      case 'L':
        return 50;
      case 'C':
        return 100;
      case 'D':
        return 500;
      case 'M':
        return 1000;
      default:
        return 0;
    }
  }
}
