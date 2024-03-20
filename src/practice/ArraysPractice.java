package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class ArraysPractice{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of matrix: ");
       int size=sc.nextInt();
        System.out.print("Enter the elements of the matrix: ");
       int[][] numbers=new int[size][size];
        for (int counter = 0; counter < numbers.length; counter++) {
            for (int  index= 0; index < numbers.length;index ++) {
                numbers[counter][index]=sc.nextInt();
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.deepToString(numbers));
        Arrays.sort(numbers, Comparator.comparingInt(ArraysPractice::getSum));
        System.out.println(Arrays.deepToString(numbers));


    }

    private static int getSum(int[] arr) {
        int sum=0;
        for( int val:arr){
            sum=sum+val;
        }
        return sum;

    }
}


