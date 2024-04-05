package Warmup2;

public class stringTimes {

  //https://codingbat.com/prob/p142270
  public String stringTimes(String str, int n) {
    String str1 = str;
    str = "";
    for (int i = 0; i < n; i++) {
      str = str + str1;
    }
    return str;
  }
}
