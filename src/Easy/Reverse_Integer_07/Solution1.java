package Easy.Reverse_Integer_07;

import javax.sound.midi.Soundbank;
import jdk.internal.util.xml.impl.Input;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/05 16:40
 */
public class Solution1 {

  public int reverse(int x) {
    int result = 0;
    //modulo operation
    while (x != 0) {
      int temp = x % 10;
      //The last digit must be less than 7
      if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && temp > 7)) {
        return 0;
      }
      //The last digit must be greater than -8
      if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && temp < -8)) {
        return 0;
      }
      result = result * 10 + temp;
      x /= 10;
    }
    return result;
  }
}
