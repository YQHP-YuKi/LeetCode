package Easy.Binary_Watch_401;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YQHP-YuKi
 * @create 2021-10-14 23:24
 */
public class Solution2 {

  public List<String> readBinaryWatch(int turnedOn) {
    ArrayList<String> strings = new ArrayList<>();
    //hour
    for (int i = 0; i < 12; i++) {
      //minute
      for (int j = 0; j < 60; j++) {
        //if n + m = turnedOn
        if (numberOf1(i) + numberOf1(j) == turnedOn) {
          //judge the minute
          strings.add(i + ":" + ((j < 10) ? "0" + j : j));
        }
      }
    }
    return strings;
  }

  /**
   * count the number of 1 in binary
   */
  private int numberOf1(int num) {
    int count = 0;
    while (num != 0) {
      ++count;
      num &= (num - 1);
    }
    return count;
  }
}
