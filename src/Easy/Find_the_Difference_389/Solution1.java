package Easy.Find_the_Difference_389;

/**
 * @author YQHP-YuKi
 * @create 2021-10-14 19:39
 */
public class Solution1 {

  public char findTheDifference(String s, String t) {
    int result = 0;
    for (int i = 0; i < s.length(); i++) {
      //char - char the result is int
      result += t.charAt(i) - s.charAt(i);
    }
    //use ASCII table to get the letter
    return (char) (result + t.charAt(t.length() - 1));
  }
}
