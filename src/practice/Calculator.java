package practice;

public class Calculator {
    public int sumOf(int num1, int num2){
        return num1+num2;
    }
    public int multiOf(int num1 ,int num2){
        return num1*num2;
    }
    public int subOf(int num1, int num2){
        if (num1>num2){
            return num1-num2;
        }
        else {
            return num2-num1;
        }
    }
    public int divOf(int num1 ,int num2){
        if (num1>num2){
            return num1/num2;
        }
        else {
            return num2/num1;
        }
    }



}
