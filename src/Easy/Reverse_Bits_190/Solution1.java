package Easy.Reverse_Bits_190;

/**
 * @author YQHP-YuKi
 * @create 2021-09-14 18:43
 */
public class Solution1 {

  // you need treat n as an unsigned value
  public int reverseBits(int n) {
    //1=00000000000000000000000000000001,so n&1 can get the tail of n
    int reverse = n & 1;
    int i = 1;
    //only need 31 times
    while (i < 32) {
      //shift one bit to the right,equivalent to removing the tail
      n = n >> 1;
      //get a new tail
      reverse = reverse << 1;
      //plus the old tail
      reverse += n & 1;
      i++;
    }
    return reverse;
  }
}
