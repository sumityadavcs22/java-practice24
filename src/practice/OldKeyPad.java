package practice;

import java.util.*;

class OldKeypadSolution {
    public static void main(String [] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int factor = 0;
        int temp;

        int m = sc.nextInt();
        int[] freq = new int[m];
        for (int i = 0; i < m; i++) {
            freq[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        long maxKeys = 0;
        int[] keys = new int[n];
        for (int i = 0; i < n; i++) {
            keys[i] = sc.nextInt();
            maxKeys += keys[i];
        }

        Arrays.sort(freq);

        if (maxKeys < m) {
            System.out.println(-1);
        } else {
            for (int i = m - 1; i >= 0;) {
                factor++;
                temp = 0;
                for (int j = 0; j < n; j++) {
                    if (keys[j] >= factor) {
                        temp += freq[i];
                        i--;
                    }
                    if (i < 0) {
                        break;
                    }
                }
                sum += factor * temp;
            }
            System.out.print(sum);
        }
    }
}
