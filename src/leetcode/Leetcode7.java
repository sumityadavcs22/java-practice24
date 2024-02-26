package leetcode;

public class Leetcode7 {
    public int reverse(int x) {
        int rem=0;
        int rev=0;
        while(x!=0){
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if(x<0){
            return rev*-1;
        }
        else {
            return rev;
        }

    }
}
