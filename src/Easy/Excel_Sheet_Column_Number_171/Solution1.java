package Easy.Excel_Sheet_Column_Number_171;

/**
 * @author YQHP-YuKi
 * @create 2021-09-13 18:41
 */
public class Solution1 {

  public int titleToNumber(String columnTitle) {
    //j is the power
    int result = 0, j = columnTitle.length();
    for (int i = 0; i < columnTitle.length(); i++) {
      //'A' - 'A' =0,so plus 1,n=1
      int n = (int) (columnTitle.charAt(i) - 'A') + 1;
      //go down one place
      j--;
      //use Math to count the result of each
      int m = (int) Math.pow(26, j);
      result += m * n;
    }
    return result;
  }
}
