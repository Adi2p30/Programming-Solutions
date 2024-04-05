package Array1;

public class midThree {
    public int[] midThree(int[] nums) {
        int[] middle = new int[]{nums[(nums.length+1)/2-2], nums[(nums.length+1)/2 - 1], nums[(nums.length+1)/2]};
        return middle;
        
      }
      
}
