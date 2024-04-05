package String1;
public class extraEnd {
      //https://codingbat.com/prob/p108853
      public String extraEnd(String str) {
        return (str.substring(str.length()-2,str.length())
                +str.substring(str.length()-2,str.length())
                +str.substring(str.length()-2,str.length()));
    };
}
