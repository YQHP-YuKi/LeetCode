package Easy.Valid_Palindrome_125;

/**
 * @author YQHP-YuKi
 * @create 2021-09-05 10:46
 */
public class Solution1 {

  public boolean isPalindrome(String s) {
    //make double pointers
    int head = 0, tail = s.length() - 1;
    while (head <= tail) {
      //if head is not lowercase and uppercase letter and is not a number,just plus
      while (head <= tail && !(s.charAt(head) >= 'a' && s.charAt(head) <= 'z') && !(
          s.charAt(head) >= 'A' && s.charAt(head) <= 'Z') && !(s.charAt(head) >= '0'
          && s.charAt(head) <= '9')) {
        head++;
      }
      //if tail is not lowercase and uppercase letter and is not a number,just minus
      while (head <= tail && !(s.charAt(tail) >= 'a' && s.charAt(tail) <= 'z') && !(
          s.charAt(tail) >= 'A' && s.charAt(tail) <= 'Z') && !(s.charAt(tail) >= '0'
          && s.charAt(tail) <= '9')) {
        tail--;
      }
      //make two temps
      char headTemp, tailTemp;
      //if the s is null character.such as "  ".it will out of time,so this is to judge the s
      if (head > tail) {
        return true;
      }
      //we can use the ASCII to judge the head,if the lowercase or the number,we don't need to
      // change
      if ((s.charAt(head) >= 'a' && s.charAt(head) <= 'z') || (s.charAt(head) >= '0'
          && s.charAt(head) <= '9')) {
        headTemp = s.charAt(head);
      } else {
        //if the uppercase,just change to the lowercase
        headTemp = (char) ((int) s.charAt(head) + 32);
      }
      //we can use the ASCII to judge the tail,if the lowercase or the number,we don't need to
      // change
      if ((s.charAt(tail) >= 'a' && s.charAt(tail) <= 'z') || (s.charAt(tail) >= '0'
          && s.charAt(tail) <= '9')) {
        tailTemp = s.charAt(tail);
      } else {
        //if the uppercase,just change to the lowercase
        tailTemp = (char) ((int) s.charAt(tail) + 32);
      }
      //just judge the head and the tail
      if (headTemp == tailTemp) {
        head++;
        tail--;
        continue;
      } else {
        return false;
      }
    }
    return true;
  }
}
