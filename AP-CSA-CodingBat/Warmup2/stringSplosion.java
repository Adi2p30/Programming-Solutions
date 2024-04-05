package Warmup2;

public class stringSplosion {
    //https://codingbat.com/prob/p117334
    public String stringSplosion(String str) {
        String str1 = "";
        for (int i = 0; i<str.length();i++){
          str1 = str1 + str.substring(0,i+1);
        }
        return str1;
      }
      
}
