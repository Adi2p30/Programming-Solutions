package String1;

public class makeOutWord {
  // https://codingbat.com/prob/p184030
  public String makeOutWord(String out, String word) {
    return out.substring(0, 2) + word + out.substring(2, 4);
  }
}
