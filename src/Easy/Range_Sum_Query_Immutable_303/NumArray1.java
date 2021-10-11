package Easy.Range_Sum_Query_Immutable_303;

/**
 * @author YQHP-YuKi
 * @create 2021-10-07 9:55
 */

/**
 * Your NumArray object will be instantiated and called as such: NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
class NumArray1 {

  int[] array;

  public NumArray1(int[] nums) {
    array = nums;
  }

  public int sumRange(int left, int right) {
    int result = 0;
    for (int i = left; i <= right; i++) {
      result += array[i];
    }
    return result;
  }
}
