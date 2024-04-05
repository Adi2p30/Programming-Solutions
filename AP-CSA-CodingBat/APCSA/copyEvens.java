package APCSA;

public class copyEvens {

  public int[] copyEvens(int[] nums, int count) {
    int[] nums1 = new int[count];
    int temp = 0;
    for (int i = 0; temp < count; i++) {
      if (nums[i] % 2 == 0) {
        nums1[temp] = nums[i];
        temp++;
      }
    }
    return nums1;
  }
}
