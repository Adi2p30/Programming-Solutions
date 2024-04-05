package APCSA;

public class scoreUP {
    public int scoreUp(String[] key, String[] answers) {
        int score = 0;
        for (int i =0; i<key.length; i++){
          if (answers[i] != "?"){
            if (answers[i].equals(key[i])){
              score = score + 4;
          }
          else{
            score = score - 1;
          }
        }
        }
        return score;
      }
      
}
