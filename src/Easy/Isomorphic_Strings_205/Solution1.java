package Easy.Isomorphic_Strings_205;

/**
 * @author YQHP-YuKi
 * @create 2021-09-16 18:53
 */
public class Solution1 {

  public boolean isIsomorphic(String s, String t) {
    int[] sLocation = new int[128];
    int[] tLocation = new int[128];
    for (int i = 0; i < s.length(); i++) {
      //get it's ASCII location
      char sCh = s.charAt(i);
      char tCh = t.charAt(i);
      //if it has the letter,just judge it is isomorphic
      if (sLocation[sCh] != tLocation[tCh]) {
        return false;
      }
      //if it is the first time appear,so remember it
      if (sLocation[sCh] == 0) {
        //why +1,because if i is 0,so it will stuck in an endless loop
        sLocation[sCh] = i + 1;
        tLocation[tCh] = i + 1;
      }
    }
    return true;
  }
}
