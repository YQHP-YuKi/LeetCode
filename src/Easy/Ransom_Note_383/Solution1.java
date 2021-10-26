package Easy.Ransom_Note_383;

import java.util.HashMap;

/**
 * @author YQHP-YuKi
 * @create 2021-10-13 16:14
 */
public class Solution1 {

  public boolean canConstruct(String ransomNote, String magazine) {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    for (int i = 0; i < magazine.length(); i++) {
      int value = magazine.charAt(i) - 'a';
      //if is the first time appear,just set initial value
      if (!hashMap.containsKey(value)) {
        hashMap.put(value, 1);
      } else {
        //calculate the number of occurrences
        hashMap.put(value, hashMap.get(value) + 1);
      }
    }
    for (int i = 0; i < ransomNote.length(); i++) {
      int value = ransomNote.charAt(i) - 'a';
      //if don't include this letter,just return false
      if (!hashMap.containsKey(value)) {
        return false;
      } else {
        //the number of occurrences is less than the number of times needed
        if (hashMap.get(value) - 1 < 0) {
          return false;
        } else {
          hashMap.put(value, hashMap.get(value) - 1);
        }
      }
    }
    return true;
  }
}
