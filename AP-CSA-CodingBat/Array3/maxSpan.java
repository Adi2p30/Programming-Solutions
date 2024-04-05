package Array3;

public class maxSpan {
    public int maxSpan(int[] nums) {
        int max = 0;
        for (int i =0; i<nums.length;i++){
          for (int j = nums.length-1; j>=i; j--){
            if (nums[i] == nums[j] && 1+j-i>max){
              max =1+j-i;
            }
          }
        }
        return max;
      }
      
}
