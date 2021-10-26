package Easy.Find_the_Difference_389;

/**
 * @author YQHP-YuKi
 * @create 2021-10-14 20:05
 */
public class Solution2 {

  public char findTheDifference(String s, String t) {
    int result = 0;
    for (int i = 0; i < s.length(); i++) {
      //use XOR,just like question 136
      result ^= s.charAt(i);
      result ^= t.charAt(i);
    }
    return (char) (result ^ t.charAt(t.length() - 1));
  }
}
