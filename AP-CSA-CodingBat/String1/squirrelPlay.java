package String1;
public class squirrelPlay {
    //https://codingbat.com/prob/p141061
    public boolean squirrelPlay(int temp, boolean isSummer) {
    boolean play = false;
    if (isSummer == true){
        if (temp>=60 && temp<=100){
            play = true;
        }
    }
    else{
        if (temp>=60 && temp<=90){
            play = true;
        }
    }
    return play;
}
}
