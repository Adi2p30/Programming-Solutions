package Array1;

public class double23 {

  public boolean double23(int[] nums) {
    int twos = 0;
    int threes = 0;
    for (int i = 0; i <= nums.length - 1; i++) {
      if (nums[i] == 2) {
        twos++;
      } else if (nums[i] == 3) {
        threes++;
      }
    }
    if (twos == 2 || threes == 2) {
      return true;
    } else {
      return false;
    }
  }
}
