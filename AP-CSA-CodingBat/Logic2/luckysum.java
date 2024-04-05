package Logic2;
//https://codingbat.com/prob/p130788
public class luckysum {
    public int luckySum(int a, int b, int c) {
        int sum = a+b+c;
        if (c==13){
          sum = b+a;
        }
        if (b==13){
          sum = a;
        }
        if (a==13){
          sum = 0;
        }
        return sum;
      }
      
}
