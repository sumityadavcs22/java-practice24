package practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysQuestion {
    public int getValue(int [] animals, int capacity){
        if(animals.length < capacity ){
            return -1;
        }
        Arrays.sort(animals);
        int index = animals.length-capacity;


        return animals[index];
    }

}

