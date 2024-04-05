package String1;

public class theEnd {

  public String theEnd(String str, boolean front) {
    if (front == true) {
      return str.substring(0, 1);
    } else {
      return str.substring(str.length() - 1, str.length());
    }
  }
}
