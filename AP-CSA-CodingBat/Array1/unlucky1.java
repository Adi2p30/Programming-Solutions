package Array1;

public class unlucky1 {
    public boolean unlucky1(int[] nums) {
        if (nums.length<=1){
          return false;
        }
        if (nums[0] == 1){
          if (nums[1]==3){
            return true;
          }
        }
        if (nums[1] == 1){
          if (nums[2]==3){
            return true;
          }
        }
        if (nums.length>=4){
        if (nums[nums.length-2] == 1){
          if (nums[nums.length-1]==3){
            return true;
          }
        }
        }
        return false;
      }
      
}
