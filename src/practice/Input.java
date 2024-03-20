package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(10);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            list.add(sc.nextInt());
        }
        System.out.println( list.size());

        System.out.println(list);

    }
}
