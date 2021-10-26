package Easy.First_Unique_Character_in_a_String_387;

/**
 * @author YQHP-YuKi
 * @create 2021-10-13 17:25
 */
public class Solution2 {

  public int firstUniqChar(String s) {
    int[] result = new int[26];
    for (int i = 0; i < s.length(); i++) {
      //use ASCII table to judge the letter
      result[s.charAt(i) - 'a']++;
    }
    for (int i = 0; i < s.length(); i++) {
      //if the letter's occurrences is 1,just return the location of the letter
      if (result[s.charAt(i) - 'a'] == 1) {
        return i;
      }
    }
    return -1;
  }
}
