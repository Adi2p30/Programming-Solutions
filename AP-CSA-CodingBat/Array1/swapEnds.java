package Array1;

public class swapEnds {

  public int[] swapEnds(int[] nums) {
    int temp = 0;
    temp = nums[0];
    nums[0] = nums[nums.length - 1];
    nums[nums.length - 1] = temp;
    return nums;
  }
}
