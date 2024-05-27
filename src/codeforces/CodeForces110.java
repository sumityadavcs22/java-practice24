package codeforces;

import java.util.Scanner;

public class CodeForces110 {
    public void isLuckyNumber(String lucky){
        for (int index = 0; index < lucky.length(); index++) {
            if(lucky.charAt(index)=='7'|| lucky.charAt(index)=='4'){
                System.out.println("Yes");

            }
            else {
                System.out.println("No");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name= sc.nextLine();
        CodeForces110 codeForces110=new CodeForces110();
        codeForces110.isLuckyNumber(name);
    }
}
