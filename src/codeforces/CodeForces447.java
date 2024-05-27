package codeforces;

import java.util.Scanner;

public class CodeForces447 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int firstConflict = findFirstConflict(p, numbers);
        System.out.println(firstConflict);
    }

    private static int findFirstConflict(int p, int[] numbers) {
        boolean[] buckets = new boolean[p];
        for (int i = 0; i < numbers.length; i++) {
            int hash = numbers[i] % p;
            if (buckets[hash]) {
                return i + 1;
            }
            buckets[hash] = true;
        }
        return -1;
    }
}

