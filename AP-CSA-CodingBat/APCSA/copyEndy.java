package APCSA;

public class copyEndy {
    public int[] copyEndy(int[] nums, int count) {
        int temp = 0;
        int[] endy = new int[count];
        for (int i = 0; temp<count; i++){
          if ((nums[i] >= 0 && nums[i]<= 10)||(nums[i] >= 90 && nums[i] <= 100)){
            endy[temp] = nums[i];
            temp++;
          }
        }
        return endy;
      }
      
      
}
