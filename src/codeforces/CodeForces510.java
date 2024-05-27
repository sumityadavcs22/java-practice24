package codeforces;

import java.util.Scanner;

public class CodeForces510 {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        int row=sc.nextInt();
        int column =sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=column; j++) {
                if(i%4==0) {
                    if (j == 1) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                }
                else if (i%4==2){
                    if(j==column){
                        System.out.print("#");
                    }
                    else{
                        System.out.print(".");
                    }
                }

                else{
                    System.out.print("#");
                }
            }
            System.out.println(" ");

        }
    }
}
