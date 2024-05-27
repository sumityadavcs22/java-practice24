package codeforces;

import java.util.Scanner;

public class CodeForces454 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i - (n-1)/2) + Math.abs(j - (n-1)/2) <= (n-1)/2) {
                    System.out.print("D");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}