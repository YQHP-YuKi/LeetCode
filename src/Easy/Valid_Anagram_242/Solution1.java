package Easy.Valid_Anagram_242;

import java.util.HashMap;

/**
 * @author YQHP-YuKi
 * @create 2021-09-25 15:54
 */
public class Solution1 {

  public boolean isAnagram(String s, String t) {
    //different length,just return false
    if (s.length() != t.length()) {
      return false;
    }
    //character is the charAt,integer is the number of the character
    HashMap<Character, Integer> hashMap = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      //if is the first time find the character,so use the defaultValue 0 and plus 1
      hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
    }
    for (int i = 0; i < t.length(); i++) {
      char ch = t.charAt(i);
      //and minus 1
      hashMap.put(ch, hashMap.getOrDefault(ch, 0) - 1);
      //it means they are different string,just return false
      if (hashMap.get(ch) < 0) {
        return false;
      }
    }
    return true;
  }
}
