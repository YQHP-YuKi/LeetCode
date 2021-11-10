package Medium.Multiply_Strings_43;

/**
 * @author YQHP-YuKi
 * @create 2021-11-2021/11/10 10:24 上午
 */
public class Solution1 {

  public String multiply(String num1, String num2) {
    //the special situation
    if (num1.equals("0") || num2.equals("0")) {
      return "0";
    }
    //we can use StringBuffer to create the result
    StringBuffer sb = new StringBuffer();
    //n+m
    int[] array = new int[num1.length() + num2.length()];
    for (int i = num1.length() - 1; i >= 0; i--) {
      //we can get the number
      int n1 = num1.charAt(i) - '0';
      for (int i1 = num2.length() - 1; i1 >= 0; i1--) {
        int n2 = num2.charAt(i1) - '0';
        int sum = array[i + i1 + 1] + n1 * n2;
        //make a example,8*4=32 32/10=3 32%10=2
        array[i + i1 + 1] = sum % 10;
        array[i + i1] += sum / 10;
      }
    }
    //judge the first digit whether is 0
    int index = array[0] == 0 ? 1 : 0;
    while (index < array.length) {
      sb.append(array[index]);
      index++;
    }
    return sb.toString();
  }
}
