package String1;

public class lastChars {
    // https://codingbat.com/prob/p138183
    public String lastChars(String a, String b) {
        String ans = "";
        if (a.length() == 0) {
            ans = ans + "@";
        } else {
            ans = ans + a.substring(0, 1);
        }
        if (b.length() == 0) {
            ans = ans + "@";
        } else {
            ans = ans + b.substring(b.length() - 1, b.length());
        }
        return ans;
    }

}
