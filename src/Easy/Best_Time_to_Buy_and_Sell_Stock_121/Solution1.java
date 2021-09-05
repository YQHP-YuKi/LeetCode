package Easy.Best_Time_to_Buy_and_Sell_Stock_121;

/**
 * @author YQHP-YuKi
 * @create 2021-09-05 9:54
 */
public class Solution1 {

  public int maxProfit(int[] prices) {
    int result = 0;
    //beginning for the head
    for (int i = 0; i < prices.length - 1; i++) {
      for (int j = i + 1; j < prices.length; j++) {
        //compare i ,i+1,until the end
        if (prices[i] < prices[j]) {
          if (result < prices[j] - prices[i]) {
            //update the result
            result = prices[j] - prices[i];
          }
        }
      }
    }
    return result;
  }
}
