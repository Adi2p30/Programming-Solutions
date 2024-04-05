package Recursion1;

public class sumDigits {

  public int sumDigits(int n) {
    if (n == 0) {
      return 0;
    } else {
      return (n % 10) + sumDigits(n /= 10);
    }
  }
}
