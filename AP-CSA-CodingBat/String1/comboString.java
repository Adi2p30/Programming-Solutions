package String1;

public class comboString {

  //https://codingbat.com/prob/p168564
  public String comboString(String a, String b) {
    if (b.length() > a.length()) {
      return a + b + a;
    } else {
      return b + a + b;
    }
  }
}
