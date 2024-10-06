package String1;

public class seeColor {
    // https://codingbat.com/prob/p199216
    public String seeColor(String str) {
        if (str.length() < 3) {
            return "";
        }
        if (str.substring(0, 3).equals("red")) {
            return "red";
        }
        if (str.length() < 4) {
            return "";
        } else if (str.substring(0, 4).equals("blue")) {
            return "blue";
        } else {
            return "";
        }
    }

}
