package String1;

public class deFront {
    // https://codingbat.com/prob/p110141
    public String deFront(String str) {
        String ans = str.substring(2, str.length());
        if (str.substring(1, 2).equals("b")) {
            ans = "b" + ans;
        }
        if (str.substring(0, 1).equals("a")) {
            ans = "a" + ans;
        }
        return ans;
    }

}
