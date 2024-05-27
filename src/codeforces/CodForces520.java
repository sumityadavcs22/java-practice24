package codeforces;



import java.util.Scanner;

public class CodForces520 {

    public static boolean isPangram(String sentence) {

        sentence = sentence.toLowerCase();


        boolean[] letters = new boolean[26];


        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c >= 'a' && c <= 'z') {
                letters[c - 'a'] = true;
            }
        }


        for (boolean b : letters) {
            if (!b) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String name =sc.next();
        if(isPangram(name)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
