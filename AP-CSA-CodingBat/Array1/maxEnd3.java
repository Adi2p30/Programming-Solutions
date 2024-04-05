package Array1;

public class maxEnd3 {
    public int[] maxEnd3(int[] nums) {
        int max = nums[0] > nums[2] ? nums[0] : nums[2];
        
        nums[0] = max;
        nums[1] = max;
        nums[2] = max;
                
        return nums;
    }
}
