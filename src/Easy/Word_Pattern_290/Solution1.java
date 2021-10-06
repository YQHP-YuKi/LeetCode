package Easy.Word_Pattern_290;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author YQHP-YuKi
 * @create 2021-10-06 10:17
 */
public class Solution1 {

  public boolean wordPattern(String pattern, String s) {
    //such as <a,dog> <c,cat>
    HashMap<Character, String> pMap = new HashMap<>();
    //such as <dog> <cat>
    HashSet<String> sSet = new HashSet<>();
    //Remove the spaces in the string,and change it to array,such as array[0] is dog,array[1] is cat
    String res[] = s.split(" ");
    //if the length is not equal,just return false
    if (res.length != pattern.length()) {
      return false;
    }
    //traversal the string
    for (int i = 0; i < pattern.length(); i++) {
      //if a letter has appeared
      if (pMap.containsKey(pattern.charAt(i))) {
        //compare whether the current array element are the same as the previous ones
        if (!res[i].equals(pMap.get(pattern.charAt(i)))) {
          return false;
        }
      } else {
        //if the letter is the first time appear,just add the array element
        if (!sSet.add(res[i])) {
          //if the element has been added,so just return false
          return false;
        }
        //HashMap put the new <s,ship>
        pMap.put(pattern.charAt(i), res[i]);
      }
    }
    return true;
  }
}
