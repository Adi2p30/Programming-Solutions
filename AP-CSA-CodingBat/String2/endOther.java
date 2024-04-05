package String2;

public class endOther {
    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length()>b.length()){
          if (a.substring(a.length()-b.length(),a.length()).equals(b)){
          return true;
        }
        else{
          return false;
        }
        }
        else{
          if (b.substring(b.length()-a.length(),b.length()).equals(a)){
          return true;
        }
        else{
          return false;
        } 
        }
      }
      
}
