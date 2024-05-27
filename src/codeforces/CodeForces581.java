package codeforces;

import java.util.Scanner;

public class CodeForces581 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt(); // Number of red socks
            int b = scanner.nextInt(); // Number of blue socks

            // Calculate the maximum number of days to wear different socks
            int minSocks = Math.min(a, b);

            // Calculate the number of days to wear the same socks afterward
            int sameSocks = (Math.max(a, b) - minSocks) / 2;

            System.out.println(minSocks + " " + sameSocks);
        }
}

