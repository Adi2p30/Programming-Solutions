package Logic2;

//https://codingbat.com/prob/p182879
public class noTeenSum {

  public int isteen(int a) {
    if (a - 10 >= 3 && a - 10 <= 9) {
      if (a == 15 || a == 16) {
        return a;
      } else {
        return 0;
      }
    } else {
      return a;
    }
  }

  public int noTeenSum(int a, int b, int c) {
    return isteen(a) + isteen(b) + isteen(c);
  }
}
