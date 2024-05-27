package codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodeForces490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> pr =new ArrayList<>();
        List<Integer> a =new ArrayList<>();
        List<Integer> pe=new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            int ele = sc.nextInt();
            if(ele==1) pr.add(i);
            if (ele==2) a.add(i);
            if (ele==3) pe.add(i);
        }
        int maxTeams= Math.min(pr.size(),Math.min(pe.size(),a.size() ));
        System.out.println(maxTeams);
        for (int i = 0; i < maxTeams; i++) {
            System.out.println(pr.get(i)+" "+a.get(i)+" " + pe.get(i));
        }
    }
}
