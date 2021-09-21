package Easy.Number_of_1_Bits_191;

/**
 * @author YQHP-YuKi
 * @create 2021-09-15 9:14
 */
public class Solution1 {

  // you need to treat n as an unsigned value
  public int hammingWeight(int n) {
    //count the number of 1
    int count = 0;
    int i = 0;
    //it must less than 32
    while (i < 32) {
      //use XOR to get the tail number
      if ((n & 1) == 1) {
        count++;
      }
      //remove the mantissa
      n = n >> 1;
      i++;
    }
    return count;
  }
}
