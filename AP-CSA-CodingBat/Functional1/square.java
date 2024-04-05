
package Functional1;

import java.util.List;

public class square {
    public List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n -> (int) Math.pow(n,2));
        return nums;
      }
      
}
