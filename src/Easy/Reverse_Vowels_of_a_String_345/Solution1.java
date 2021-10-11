package Easy.Reverse_Vowels_of_a_String_345;

/**
 * @author YQHP-YuKi
 * @create 2021-10-09 15:34
 */
public class Solution1 {

  public String reverseVowels(String s) {
    int head = 0, tail = s.length() - 1;
    //we can change the string,so we change it into a char array
    char[] array = s.toCharArray();
    //use two pointer
    while (head < tail) {
      //make this judgement head < tail is to avoid ",." cross-border situation
      while (head < tail && vowele(array[head])) {
        head++;
      }
      while (head < tail && vowele(array[tail])) {
        tail--;
      }
      if (head >= tail) {
        break;
      }
      //swap the two pointers
      char swap = array[head];
      array[head] = array[tail];
      array[tail] = swap;
      head++;
      tail--;
    }
    return new String(array);
  }

  /**
   * determine whether a letter is a vowel
   */
  private boolean vowele(char ch) {
    return !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'
        || ch == 'I' || ch == 'O' || ch == 'U');
  }
}
