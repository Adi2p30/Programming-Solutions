//https://leetcode.com/problems/shuffle-the-array/
public class Solution {
    public int[] Shuffle(int[] nums, int n) {
        int[] ans = new int[nums.Length];
        int i=0, j=n;
        int cnt  = 0;
        while(j< nums.Length)
        {
            ans[cnt] = nums[i];
            ans[cnt+1] = nums[j];
            cnt = cnt+2;
            i++;
            j++;
        }
        return ans;
    }
}