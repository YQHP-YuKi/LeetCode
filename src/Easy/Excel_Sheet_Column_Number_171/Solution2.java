package Easy.Excel_Sheet_Column_Number_171;

/**
 * @author YQHP-YuKi
 * @create 2021-09-13 19:06
 */
public class Solution2 {

  public int titleToNumber(String columnTitle) {
    int result = 0, num = 0;
    for (int i = 0; i < columnTitle.length(); i++) {
      num = columnTitle.charAt(i) - 'A' + 1;
      //the first letter times 26 length()-1 and plus the next letter
      result = result * 26 + num;
    }
    return result;
  }
}
