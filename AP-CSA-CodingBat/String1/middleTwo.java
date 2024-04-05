package String1;

public class middleTwo {
    //https://codingbat.com/prob/p137729
public String middleTwo(String str) {
    if (str.length()%2 == 0){
      return str.substring((str.length()/2)-1, (str.length()/2)+1);
    }
    else{
    return str.substring(((str.length()+1)/2)-1, ((str.length()+1/2))+1);
    } 
  }    
}
