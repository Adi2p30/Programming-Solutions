package String1;

public class withouEnd {
    //https://codingbat.com/prob/p174254
public String withouEnd2(String str) {
    if (str.length()>1){
    return str.substring(1,str.length()-1);
    }else{
      return "";
    }
  } 
}
