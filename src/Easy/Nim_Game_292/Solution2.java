package Easy.Nim_Game_292;

/**
 * @author YQHP-YuKi
 * @create 2021-10-06 11:36
 */
public class Solution2 {

  public boolean canWinNim(int n) {
    //n<=3,it will win,so return true
    if (n <= 3) {
      return true;
    } else {
      //if n==4,no matter hwo many A take.B will always win.So get the opposite situation !(B win)
      return !(canWinNim(n - 1) && canWinNim(n - 2) && canWinNim(n - 3));
    }
  }
}
