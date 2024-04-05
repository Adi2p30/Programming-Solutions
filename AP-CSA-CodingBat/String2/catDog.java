package String2;

public class catDog {
    public boolean catDog(String str) {
        int countcat = 0;
        int countdog = 0;
        for (int i = 0; i<str.length()-2;i++){
          if (str.substring(i, i+3).equals("cat")){
            countcat++;
          }else if (str.substring(i, i+3).equals("dog")){
            countdog++;
          }
        }
        if (countdog == countcat){
          return true;
        }
        else{
          return false;
        }
      }
      
}
