package Easy.Add_Binary_67;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/14 15:47
 */
public class Solution1 {

  public String addBinary(String a, String b) {
    StringBuilder sb = new StringBuilder();
    //get a and b length
    int i = a.length() - 1;
    int j = b.length() - 1;
    //judge whether add 1 to the next digit
    int result = 0;
    //from tail to head
    while (i >= 0 || j >= 0) {
      //get the two digit sum
      int sum = result;
      //if a is end
      if (i >= 0) {
        //'1'-'0'=1,'0'-'0'=0
        sum += a.charAt(i) - '0';
      }
      //if i is end
      if (j >= 0) {
        sum += b.charAt(j) - '0';
      }
      //judge sum whether is 1 or 2 or 3
      sb.append(sum % 2);
      //if sum is 0 or 1,just continue,if i is 3,should +1
      result = sum / 2;
      i--;
      j--;
    }
    //if new add 1
    if (result != 0) {
      sb.append(result);
    }
    //return the new string
    return sb.reverse().toString();
  }
}
