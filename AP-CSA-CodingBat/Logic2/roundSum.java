package Logic2;

//https://codingbat.com/prob/p186753
public class roundSum {

  public int round10(int num) {
    int num1 = num;
    while (num1 > 10) {
      num1 = num1 % 10;
    }
    num = num - num1;
    if (num1 >= 5) {
      num1 = 10;
    } else {
      num1 = 0;
    }
    num = num + num1;
    return num;
  }

  public int roundSum(int a, int b, int c) {
    return round10(a) + round10(b) + round10(c);
  }
}
