package Warmup2;

public class last2 {
    //https://codingbat.com/prob/p178318
    public int last2(String str) {
        if (str.length()>2){
        String str1 = str.substring(str.length()-2, str.length());
        int count = 0;
        for(int i = 0; i<str.length()-2; i++){
          if (str.substring(i,i+2).equals(str1)){
            count++;
          }
        }
        return count;
        }else{
          return 0;
        }
      }
      
}
