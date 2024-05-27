package codeforces;

import java.util.Scanner;

public class Codeforces363 {
    public void printDigit(int digit){
        switch (digit){
            case 0 :
                System.out.println("0-|-0000");
                break;
            case 1 :
                System.out.println("0-|0-000");
                break;
            case 2 :
                System.out.println("0-|00-00");
                break;
            case 3:
                System.out.println("0-|000-0");
                break;
            case 4 :
                System.out.println("0-|0000-");
                break;
            case 5 :
                System.out.println("-0|-0000");
                break;
            case 6 :
                System.out.println("-0|0-000");
                break;
            case 7 :
                System.out.println("-0|00-00");
                break;
            case 8 :
                System.out.println("-0|000-0");
                break;
            case 9 :
                System.out.println("-0|0000-");
                break;
        }
    }
    public  void printSoraban(int value){
        if (value==0){
            printDigit(0);
            return;
        }
        while (value>0){
        int digit = value%10;
        printDigit(digit);
        value /=10;
    }



}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Codeforces363 soraban = new Codeforces363();
        int n = sc.nextInt();
        soraban.printSoraban(n);
    }

}