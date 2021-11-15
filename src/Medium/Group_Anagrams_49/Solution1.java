package Medium.Group_Anagrams_49;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author YQHP-YuKi
 * @create 2021-11-15 11:36
 */
public class Solution1 {

  public List<List<String>> groupAnagrams(String[] strs) {
    //creat the HashMap,key values
    HashMap<String, List<String>> map = new HashMap<>();
    //traversal the strs
    for (String s : strs) {
      //change the string to the char array
      char[] array = s.toCharArray();
      //sort the arry,arrange the letters from small to large,get the key
      Arrays.sort(array);
      String symbol = new String(array);
      //if doesn't have the key,just add the (key,value)
      if (!map.containsKey(symbol)) {
        ArrayList<String> list = new ArrayList<>();
        list.add(s);
        map.put(symbol, list);
      } else {
        //have the key,so just need to get the value,and add into the value
        map.get(symbol).add(s);
      }
    }
    //return all values
    return new ArrayList<>(map.values());
  }
}
