package Easy.Is_Subsequence_392;

/**
 * @author YQHP-YuKi
 * @create 2021-10-14 20:22
 */
public class Solution1 {

  public boolean isSubsequence(String s, String t) {
    int i = 0, j = 0;
    while (i < s.length() && j < t.length()) {
      //if there are equal,just update the i
      if (s.charAt(i) == t.charAt(j)) {
        i++;
      }
      //j must update each time
      j++;
    }
    //verify that the value of i is equal to the length of s
    return i == s.length();
  }
}
