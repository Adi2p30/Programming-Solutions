package String1;

public class frontAgain {
    // https://codingbat.com/prob/p196652
    public boolean frontAgain(String str) {
        if (str.length() < 2) {
            return false;
        }
        return (str.substring(0, 2).equals(str.substring(str.length() - 2, str.length())));
    }

}
