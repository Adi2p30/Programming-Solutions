package Array1;

public class sameFirstLast {

  public boolean sameFirstLast(int[] nums) {
    if (nums.length >= 1) {
      if (nums[0] == nums[nums.length - 1]) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }
}
