package Easy.Ransom_Note_383;

/**
 * @author YQHP-YuKi
 * @create 2021-10-13 16:27
 */
public class Solution2 {

  public boolean canConstruct(String ransomNote, String magazine) {
    //26 letters
    int[] result = new int[26];
    for (int i = 0; i < magazine.length(); i++) {
      result[magazine.charAt(i) - 'a']++;
    }
    for (int i = 0; i < ransomNote.length(); i++) {
      if (result[ransomNote.charAt(i) - 'a'] == 0) {
        return false;
      } else {
        result[ransomNote.charAt(i) - 'a']--;
      }
    }
    return true;
  }
}
