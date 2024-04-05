package Logic2;
//https://codingbat.com/prob/p148972
public class loneSum {
    public int loneSum(int a, int b, int c) {
        if (a==b && a==c){
          return 0;
        }
        if (a==b){
          return c;
        }
        if (a==c){
          return b;
        }
        if (c==b){
          return a;
        }
        else {
          return a+b+c;
        }
      }
      
}
