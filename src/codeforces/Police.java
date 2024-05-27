package codeforces;


import java.util.Scanner;

public class Police {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int officers=0;
        int untreated=0;

        int []arr = new int[size];
        for (int i = 0; i < arr.length; i++)  {
            arr[i]= sc.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==-1){
                if(officers==0){
                    untreated++;
                }
                else{
                    officers--;

                }
            }else {
                officers+=arr[i];

            }

        }
        System.out.println(untreated);

    }
}
