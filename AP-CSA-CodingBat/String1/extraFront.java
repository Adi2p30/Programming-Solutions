package String1;

public class extraFront {
    // https://codingbat.com/prob/p172063
    public String extraFront(String str) {
        if (str.length() < 1) {
            return "";
        } else if (str.length() == 1) {
            return str + str + str;
        } else {
            return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        }
    }

}
