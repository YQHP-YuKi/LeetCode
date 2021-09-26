package Easy.Valid_Anagram_242;

/**
 * @author YQHP-YuKi
 * @create 2021-09-25 16:17
 */
public class Solution2 {

  public boolean isAnagram(String s, String t) {
    //different length,just return false
    if (s.length() != t.length()) {
      return false;
    }
    //26 letters
    int[] ch = new int[26];
    //traversal s and t
    for (int i = 0; i < s.length(); i++) {
      ch[s.charAt(i) - 'a']++;
      ch[t.charAt(i) - 'a']--;
    }
    //traversal the arrays
    for (int i = 0; i < 26; i++) {
      if (ch[i] != 0) {
        return false;
      }
    }
    return true;
  }
}
