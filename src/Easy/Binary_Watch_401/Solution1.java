package Easy.Binary_Watch_401;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author YQHP-YuKi
 * @create 2021-10-14 21:50
 */
public class Solution1 {

  public List<String> readBinaryWatch(int turnedOn) {
    //make two HashMap to store hour and minutes values separately
    HashMap<Integer, List<String>> hashHour = new HashMap<>();
    HashMap<Integer, List<String>> hashMins = new HashMap<>();
    //such as hour : 1,2,4,8 only have one 1
    for (int i = 0; i < 12; i++) {
      int hours = numberOf1(i);
      hashHour.putIfAbsent(hours, new ArrayList<String>());
      hashHour.get(hours).add(i + "");
    }
    //count the minute,get the number of 1
    for (int i = 0; i < 60; i++) {
      int mins = numberOf1(i);
      hashMins.putIfAbsent(mins, new ArrayList<String>());
      //if the minute is 01,02,04,08
      if (i < 10) {
        hashMins.get(mins).add("0" + i);
      } else {
        hashMins.get(mins).add(i + "");
      }
    }
    ArrayList<String> result = new ArrayList<>();
    //if the hour's number of 1 is n,so minute's number of 1 is m-n
    for (int i = 0; i <= turnedOn; i++) {
      //non-existent situation,just continue
      if (!hashHour.containsKey(i) || !hashMins.containsKey(turnedOn - i)) {
        continue;
      }
      //enumeration method,paired with each other
      for (String s : hashHour.get(i)) {
        for (String s1 : hashMins.get(turnedOn - i)) {
          result.add(s + ":" + s1);
        }
      }
    }
    return result;
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
