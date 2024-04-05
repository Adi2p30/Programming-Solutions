package String1;
public class atFirst {
// https://codingbat.com/prob/p139076
  public String atFirst(String str){
  if (str.length()>=2){
    return str.substring(0,2);
  }
  else {
    str = str + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@";
    return str.substring(0,2);
  }
}
}

