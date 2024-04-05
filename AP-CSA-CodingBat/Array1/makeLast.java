package Array1;

public class makeLast {

  public int[] makeLast(int[] nums) {
    int[] nums1 = new int[nums.length * 2];
    nums1[nums.length * 2 - 1] = nums[nums.length - 1];
    return nums1;
  }
}
