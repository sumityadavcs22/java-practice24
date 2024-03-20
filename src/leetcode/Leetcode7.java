package leetcode;

public class Leetcode7 {
    public int reverse(int x) {
        int rem = 0;
        long rev = 0;
        while (x != 0) {
            rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        if (rev > 2147483647 || rev < -2147483648) {
            return 0;
        }
        if (x < 0) {
            return (int) rev * -1;
        } else {
            return (int) rev;
        }
    }
}

