package Easy.Excel_Sheet_Column_Title_168;

/**
 * @author YQHP-YuKi
 * @create 2021-09-08 9:16
 */
public class Solution1 {

  public String convertToTitle(int columnNumber) {
    StringBuffer sb = new StringBuffer();
    //make a remainder
    int remainder = 0;
    while (columnNumber > 0) {
      columnNumber--;
      remainder = columnNumber % 26;
      //get a single letter
      sb.append((char) (remainder + 'A'));
      //get the next letter
      columnNumber /= 26;
    }
    //the result is opposite.so we need to use reverse
    return sb.reverse().toString();
  }
}
