package Recursion1;

public class fibonacci {
    public int fibonacci(int n) {
        if (n == 0 || n==1){
          return n;
        }
        return fibonacci(n-2) + fibonacci(n-1);
      }
      
}
