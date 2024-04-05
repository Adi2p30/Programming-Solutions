package Array1;

public class fix23 {

  public int[] fix23(int[] nums) {
    for (int i = 0; i <= 1; i++) {
      if (nums[i] == 2) {
        if (nums[i + 1] == 3) {
          nums[i + 1] = 0;
        }
      }
    }
    return nums;
  }
}
