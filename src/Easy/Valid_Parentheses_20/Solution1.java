package Easy.Valid_Parentheses_20;

import java.util.Stack;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/07 19:10
 */
public class Solution1 {

  public boolean isValid(String s) {
    if (s.length() % 2 == 1) {
      return false;
    }
    //create a stack to storage parentheses
    Stack<String> chars = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      //convert char to string
      String currChar = String.valueOf(s.charAt(i));
      /*      judge the current character is a left parentheses.if is a left parentheses,push it onto
       the stack*/
      //to be attention,never be used "==",In order to avoid bad bugs in the program. On the surface, this kind of bug looks like a random intermittent error
      if ("(".equals(currChar) || "{".equals(currChar) || "[".equals(currChar)) {
        chars.push(currChar);
      } else if (")".equals(currChar)) {
        //if Stcak is empty,return false
        if (chars.isEmpty()) {
          return false;
        }
        String StringPop = chars.pop();
        if (StringPop == null || !("(".equals(StringPop))) {
          return false;
        }
      } else if ("}".equals(currChar)) {
        if (chars.isEmpty()) {
          return false;
        }
        String StringPop = chars.pop();
        if (StringPop == null || !("{".equals(StringPop))) {
          return false;
        }
      } else if ("]".equals(currChar)) {
        if (chars.isEmpty()) {
          return false;
        }
        String StringPop = chars.pop();
        if (StringPop == null || !("[".equals(StringPop))) {
          return false;
        }
      }
    }
    //if the chars still have,it means still have left bracket
    if (chars.isEmpty()) {
      return true;
    } else {
      return false;
    }
  }
}
