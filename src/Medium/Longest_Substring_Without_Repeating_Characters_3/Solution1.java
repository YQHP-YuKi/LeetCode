package Medium.Longest_Substring_Without_Repeating_Characters_3;

import java.util.HashSet;

/**
 * @author YQHP-YuKi
 * @create 2021-10-17 11:24
 */
public class Solution1 {

  public int lengthOfLongestSubstring(String s) {
    //use HashSet to mark the character
    HashSet<Character> hashSet = new HashSet<>();
    //if j is 0,j++ is 1,equivalent to ignoring the first,so j must -1
    int j = -1, length = 0;
    for (int i1 = 0; i1 < s.length(); i1++) {
      //this situation must find a repeating characters,so remove the first,if still repeating,
      // just continue
      if (i1 != 0) {
        hashSet.remove(s.charAt(i1 - 1));
      }
      //if don't find the repeating characters,just continue move right pointer
      while (j + 1 < s.length() && !hashSet.contains(s.charAt(j + 1))) {
        hashSet.add(s.charAt(j + 1));
        j++;
      }
      //calculate the length of each time,marked the max length
      length = Math.max(length, j - i1 + 1);
    }
    return length;
  }
}
