package practice;

public class GetNegativeNumber {
    public int getNegativeNumbersCount(int[] arr) {
        int counter = 0;

        int first = 0;
        int last = arr.length - 1;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            counter += (last - mid + 1);

            if (arr[mid] < 0) {

                counter += (first - mid + 1);
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return counter;


    }
}


