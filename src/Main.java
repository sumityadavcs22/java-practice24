import number.Student;
import practice.GetNegativeNumber;
import practice.ReverseOfArray;

import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Search sc=new Search();
        int length= scanner.nextInt();
        int key= scanner.nextInt();
        int [] student =new int[length];
        for (int index = 0; index < student.length; index++) {
            student[index]=scanner.nextInt();
        }
        System.out.println("Student : " + Arrays.toString(student));
        System.out.println(sc.containsElement(student,key));
    }
}

