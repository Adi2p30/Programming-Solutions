package Warmup2;

public class stringBits {
    //https://codingbat.com/prob/p165666
    public String stringBits(String str) {
        String str1 = "";
        for (int i=0; i<str.length();i = i + 2){
          str1 = str1 + str.substring(i,i+1);
        }
        return str1;
      }
      
}
