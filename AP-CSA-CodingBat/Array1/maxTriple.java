package Array1;

public class maxTriple {

  public int maxTriple(int[] nums) {
    int max = 0;
    if (nums[0] > nums[(nums.length - 1) / 2]) {
      max = nums[0];
    } else {
      max = nums[(nums.length - 1) / 2];
    }
    if (nums[nums.length - 1] > max) {
      max = nums[nums.length - 1];
    }
    return max;
  }
}
