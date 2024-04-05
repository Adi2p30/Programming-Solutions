package APCSA;

public class scoresAverage {
    public int average(int[] half, int start, int end){
        int count = 0;
        for (int i=start;i<end;i++){
          count = count + half[i];
        }
        return count/(half.length/2);
      }
    public int scoresAverage(int[] scores) {
      int avg1 = average(scores, 0,scores.length/2);
      int avg2 = average(scores, scores.length/2 ,scores.length);
      if (avg1 > avg2){
        return avg1;
      }
      else{
        return avg2;
      }
      }
      
    
}
