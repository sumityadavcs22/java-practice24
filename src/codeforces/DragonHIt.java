package codeforces;


public class DragonHIt {
    public static  int countDragon(int k, int l, int m , int n , int d  ){
        int damagedDragonCount = 0;
        for(int i =1; i <=d;i++){
            if ( i%l==0 || i %k==0 || i%m==0 || i% n==0 ){
                damagedDragonCount++;
            }
        }
        return damagedDragonCount;
    }
}
