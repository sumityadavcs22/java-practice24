package practice;

import java.util.Arrays;
import java.util.Scanner;

class ArraysPractice{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=sc.nextInt();
        int [][] arr = new int[size][size];
        System.out.print("Enter the elements of an Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));

        }
    }
}

