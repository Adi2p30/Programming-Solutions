package Array1;

public class makeMiddle {

  public int[] makeMiddle(int[] nums) {
    int[] nums1 = new int[] {
      nums[(nums.length - 2) / 2],
      nums[(nums.length) / 2],
    };
    return nums1;
  }
}
