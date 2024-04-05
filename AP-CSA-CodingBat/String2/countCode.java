package String2;

public class countCode {
    public int countCode(String str) {
        int count = 0;
        for (int i = 0;i<str.length()-3;i++){
          if (str.substring(i,i+1).equals("c")&&str.substring(i+1,i+2).equals("o")&&str.substring(i+3,i+4).equals("e")){
            count++;
          }
        }
        return count;
      }
      
}
