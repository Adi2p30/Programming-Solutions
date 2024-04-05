package String1;
public class minCat {
    //https://codingbat.com/prob/p105745
    public String minCat(String a, String b) {
        boolean longer = true;
        int difference = 0;
        if (a.length() >= b.length()){
            difference = a.length()-b.length();
            longer = true;
        }
        else {
            difference = b.length()-a.length();
            longer = false;
        };
        if (longer == true){
            return(a.substring(difference,a.length()) + b);
        }
        else{
            return(a + b.substring(difference,b.length()));
        }
    }
}