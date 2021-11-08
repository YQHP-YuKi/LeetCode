package Medium.Count_and_Say_38;

/**
 * @author YQHP-YuKi
 * @create 2021-11-04 20:48
 */
public class Solution1 {

  public String countAndSay(int n) {
    //the basic of recursion
    if (n == 1) {
      return "1";
    }
    //we can use StringBuilder to get the result string
    String lastCount = countAndSay(n - 1);
    StringBuilder sb = new StringBuilder();
    //begin from the head of string
    for (int i = 0; i < lastCount.length(); i++) {
      //must have at least one element
      int count = 1;
      //avoids crossing boundaries
      while (i + 1 < lastCount.length() && lastCount.charAt(i) == lastCount.charAt(i + 1)) {
        count++;
        i++;
      }
      //get the result string
      sb.append(count).append(lastCount.charAt(i));
    }
    return sb.toString();
  }
}
