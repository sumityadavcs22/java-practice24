package number;


public class OperationOnNumber {

    public int sumOfDigits(int data) {
        int sum = 0;
        int rem = 0;
        while (data != 0) {
            rem = data % 10;
            sum += rem;
            data = data / 10;
        }
        return sum;
    }


    public int reverseOfNumber(int data) {
        int rem ;
        int rev =0;
        while (data != 0) {
            rem = data % 10;
            rev = rev * 10 + rem;
            data = data / 10;
        }
        return rev;
    }


    public int isPrime(int i, int data) {
        if (data == i) {
            return 0;
        } else {
            if (data % i == 0) {
                return 1;
            }
        }
        return isPrime(i + 1, data);


    }

}
