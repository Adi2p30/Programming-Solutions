package Logic2;
//https://codingbat.com/prob/p183562
public class makeBricks {
    public boolean makeBricks(int small, int big, int goal) {
        if (goal > small + big * 5){
        return false;
        }
      else{
        return goal % 5 <= small;
      }
      }
      
}
