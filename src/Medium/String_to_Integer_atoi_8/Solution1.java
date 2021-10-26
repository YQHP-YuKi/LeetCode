package Medium.String_to_Integer_atoi_8;

/**
 * @author YQHP-YuKi
 * @create 2021-10-18 16:54
 */
public class Solution1 {

  public int myAtoi(String s) {
    //change it into array
    char[] array = s.toCharArray();
    //pointer
    int index = 0;
    //remove the character which is not number of "+" "-"
    while (index < array.length && array[index] == ' ') {
      index++;
    }
    //the special situation
    if (index == array.length) {
      return 0;
    }
    //default situation
    boolean positive = true;
    //if find the sign,judge whether is negative or positive sign
    if (array[index] == '+') {
      index++;
    } else if (array[index] == '-') {
      positive = false;
      index++;
    }
    //judge whether out of range
    int result = 0, overflow = 0;
    while (index < array.length) {
      char c = array[index];
      //if not number,just end the search
      if (c < '0' || c > '9') {
        break;
      }
      int temp = c - '0';
      result = overflow;
      overflow = overflow * 10 + temp;
      //if out of range,just return
      if (result != overflow / 10) {
        return positive == true ? Integer.MAX_VALUE : Integer.MIN_VALUE;
      }
      index++;
    }
    //add symbol
    return positive == true ? overflow : 0 - overflow;
  }
}
