package APCSA;

public class wordsFront {

  public String[] wordsFront(String[] words, int n) {
    String[] ans = new String[n];
    for (int i = 0; i < n; i++) {
      ans[i] = words[i];
    }
    return ans;
  }
}
