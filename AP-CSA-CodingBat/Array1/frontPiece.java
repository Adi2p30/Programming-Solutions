package Array1;

public class frontPiece {
    public int[] frontPiece(int[] nums) {
        int[] nums1 = new int[2];
        if(nums.length<=1){
          return nums;
        }
        else{
          nums1[0] = nums[0];
          nums1[1] = nums[1];
         return nums1;
        }
      }
      
}
