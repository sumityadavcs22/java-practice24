package practice;

import java.util.Arrays;
import java.util.Scanner;
class Ants{
    public int newPosi(int x , int y , int T , int N){
        return (x+y*T)%N;
    }


}

class main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Ants ants=new Ants();
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int T = scanner.nextInt();
        int [] positions = new int[M];
        for (int index = 0; index < M; index++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int newPosition =ants.newPosi(x,y,T,N);
            if(newPosition<=0){
                newPosition+=N;
            }
            positions[index]=newPosition;
        }
        Arrays.sort(positions);
        for (int pos : positions){
            System.out.print(pos +" ");
        }
    }
}