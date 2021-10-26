package Easy.First_Unique_Character_in_a_String_387;

import java.util.HashMap;

/**
 * @author YQHP-YuKi
 * @create 2021-10-13 17:03
 */
public class Solution1 {

  public int firstUniqChar(String s) {
    HashMap<Character, Integer> hashMap = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      //count the number of occurrences
      hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
    }
    for (int i = 0; i < s.length(); i++) {
      //if the number is 1,just return the location of the letter
      if (hashMap.get(s.charAt(i)) == 1) {
        return i;
      }
    }
    return -1;
  }
}
