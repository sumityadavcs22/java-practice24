package practice;

import java.util.ArrayList;

public class ArrayListPractice{
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>(10);
        arrayList.add(10);
        arrayList.add(39);
        arrayList.add(3);
        arrayList.add(9);
        arrayList.add(83);
        arrayList.add(2,89);
        System.out.println(" arraylist= " + arrayList);
    }
}