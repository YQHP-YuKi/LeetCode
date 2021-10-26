package Easy.Guess_Number_Higher_or_Lower_374;

/**
 * @author YQHP-YuKi
 * @create 2021-10-12 11:46
 */

/**
 * Forward declaration of guess API.
 *
 * @param
 * @return -1 if num is lower than the guess number 1 if num is higher than the guess number
 * otherwise return 0 int guess(int num);
 */
public class Solution1 {

  public int guessNumber(int n) {
    int head = 1, tail = n;
    while (head < tail) {
      int mid = head + (tail - head) / 2;
      //mid > n
      if (guess(mid) == -1) {
        tail = mid - 1;
      } else if (guess(mid) == 1) {
        //mid < n
        head = mid + 1;
      } else {
        //find the target
        return mid;
      }
    }
    //while head==tail
    return head;
  }

  private int guess(int number) {
    return 0;
  }
}
