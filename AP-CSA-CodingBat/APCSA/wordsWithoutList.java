package APCSA;

import java.util.*;

public class wordsWithoutList {
    public List wordsWithoutList(String[] words, int len) {
        ArrayList <String> ans = new ArrayList<String>();
        for (int i =0; i<words.length;i++){
          if (words[i].length() != len ){
            ans.add(words[i]);
          }
        }
        return ans;
      }
      
}
