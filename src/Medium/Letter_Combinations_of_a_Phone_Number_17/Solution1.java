package Medium.Letter_Combinations_of_a_Phone_Number_17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author YQHP-YuKi
 * @create 2021-10-20 16:04
 */
public class Solution1 {

  public List<String> letterCombinations(String digits) {
    ArrayList<String> list = new ArrayList<>();
    //the special situation
    if (digits.length() == 0) {
      return list;
    }
    //create the HashMap
    HashMap<Character, String> map = new HashMap<>();
    map.put('2', "abc");
    map.put('3', "def");
    map.put('4', "ghi");
    map.put('5', "jkl");
    map.put('6', "mno");
    map.put('7', "pqrs");
    map.put('8', "tuv");
    map.put('9', "wxyz");
    backTracking(0, list, map, new StringBuffer(), digits);
    return list;
  }

  /**
   * use recursion to connect the letters
   */
  private void backTracking(int i, ArrayList<String> list, HashMap<Character, String> map,
      StringBuffer buffer, String digits) {
    //if it reaches the end,just return the letters you find
    if (i == digits.length()) {
      list.add(buffer.toString());
    } else {
      //such as digits.charAt(i) is '2',and search 2 in HashMap
      String s = map.get(digits.charAt(i));
      //traverse the number
      for (int i1 = 0; i1 < s.length(); i1++) {
        //add the last letters
        buffer.append(s.charAt(i1));
        //recursion
        backTracking(i + 1, list, map, buffer, digits);
        /*it also writes buffer.deleteCharAt(buffer.length()-1),if you don't write,StringBuilder
         will pollute the buff,StringBuilder passes in the same object,
         so the last operation must be withdrawn after the recursion is completed,
         and the last added character needs to be deleted*/
        buffer.deleteCharAt(i);
      }
    }
  }
}
