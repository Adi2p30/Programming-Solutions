package Array1;

public class makeEnds {

  public int[] makeEnds(int[] nums) {
    int[] middle = new int[] { nums[0], nums[nums.length - 1] };
    return middle;
  }
}
