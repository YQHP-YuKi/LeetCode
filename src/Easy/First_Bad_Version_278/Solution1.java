package Easy.First_Bad_Version_278;

/**
 * @author YQHP-YuKi
 * @create 2021-10-05 10:40
 */

/**
 * The isBadVersion API is defined in the parent class VersionControl. boolean isBadVersion(int
 * version);
 */
public class Solution1 {

  /**
   * this is a fake code to slove the Cannot resolve method
   */
  private boolean isBadVersion(int i) {
    if (i == 0) {
      return true;
    } else {
      return false;
    }
  }

  public int firstBadVersion(int n) {
    int head = 1;
    while (head < n) {
      int mid = (n - head) / 2 + head;
      if (!isBadVersion(mid)) {
        head = mid + 1;
      } else {
        n = mid;
      }
    }
    return head;
  }
}
