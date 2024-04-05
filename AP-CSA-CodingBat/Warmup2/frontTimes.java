package Warmup2;

public class frontTimes {

  //https://codingbat.com/prob/p101475
  public String frontTimes(String str, int n) {
    String str1 = "";
    if (str.length() < 3) {
      str1 = str;
    } else {
      str1 = str.substring(0, 3);
    }
    str = "";
    for (int i = 0; i < n; i++) {
      str = str + str1;
    }
    return str;
  }
}
