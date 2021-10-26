package Medium.ZigZag_Conversion_6;

import java.util.ArrayList;

/**
 * @author YQHP-YuKi
 * @create 2021-10-18 11:31
 */
public class Solution1 {

  public String convert(String s, int numRows) {
    //special cases "AB" "A"
    if (numRows < 2) {
      return s;
    }
    //each row is a arraylist to store each element,so StringBuilder
    ArrayList<StringBuilder> list = new ArrayList<>();
    for (int i = 0; i < numRows; i++) {
      list.add(new StringBuilder());
    }
    //row1 begin is 0
    int i = 0, reverse = -1;
    for (char c : s.toCharArray()) {
      //each element add to their own row list
      list.get(i).append(c);
      //will row number is 0 or numRows -1.switch direction
      if (i == 0 || i == numRows - 1) {
        reverse = -reverse;
      }
      i += reverse;
    }
    //connect each row of the list
    StringBuilder Builder = new StringBuilder();
    for (StringBuilder s1 : list) {
      Builder.append(s1);
    }
    return Builder.toString();
  }
}
