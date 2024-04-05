package String1;

public class dateFashion {

  //https://codingbat.com/prob/p103360
  public int dateFashion(int you, int date) {
    int result = 1;
    if (you <= 2 || date <= 2) {
      result = 0;
    } else if (you >= 8 || date >= 8) {
      result = 2;
    }
    return result;
  }
}
