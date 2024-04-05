package Logic2;
//https://codingbat.com/prob/p198700
public class evenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
        return  (a - b == b - c) || (a - c == c - b) || (a - b == c - a);
      }
      
}
