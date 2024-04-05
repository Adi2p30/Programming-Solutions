package String2;

public class doubleChar {
    public String doubleChar(String str) {
        String str1 = new String("");
        for (int i = 0;i<str.length();i++){
          str1 = str1+str.substring(i,i+1)+str.substring(i,i+1);
        }
        return str1;
      }
      
}
