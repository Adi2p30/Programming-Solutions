package Array1;

public class has23 {

  public boolean has23(int[] nums) {
    if (nums[0] == 2 || nums[0] == 3) {
      return true;
    }
    if (nums[1] == 2 || nums[1] == 3) {
      return true;
    }
    return false;
  }
}
