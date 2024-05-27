package codeforces;

import java.util.Scanner;

public class CodeForces431 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[4];

        for (int i = 0; i <4 ; i++) {
            arr [i]= sc.nextInt();

        }
        String str =sc.next();
        int sum=0;
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            int value = ch - '1';
            sum+=arr[value];

        }
        System.out.println(sum);

    }
}
