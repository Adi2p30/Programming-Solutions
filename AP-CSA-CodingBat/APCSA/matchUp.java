package APCSA;

public class matchUp {

  public int matchUp(String[] a, String[] b) {
    int count = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] != "" && b[i] != "") {
        if (a[i].substring(0, 1).equals(b[i].substring(0, 1))) {
          count++;
        }
      }
    }
    return count;
  }
}
