package Easy.Range_Sum_Query_Immutable_303;

/**
 * @author YQHP-YuKi
 * @create 2021-10-07 10:15
 */

/**
 * Your NumArray object will be instantiated and called as such: NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
class NumArray2 {

  int[] array;

  public NumArray2(int[] nums) {
    int n = nums.length + 1;
    array = new int[n];
    //array[i+1] is the previous elements of nums[0] to nums[i]
    for (int i = 0; i < nums.length; i++) {
      array[i + 1] = array[i] + nums[i];
    }
  }

  public int sumRange(int left, int right) {
    //array[right+1]=nums[0]+...+nums[right] array[left+1]=nums[0]+...+nums[left]
    //array[right+1]-array[left+1]=nums[right]-...-nums[left]
    return array[right + 1] - array[left];
  }
}
