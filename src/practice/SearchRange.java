package practice;

import java.util.Arrays;

class SearchRange {
    int[] searchRange (int[] arr, int key) {
        int first=firstOccurence(arr,key);
        int last=lastOccurence(arr,key);

        return new int[]{first,last};

    }
    int firstOccurence(int[]arr,  int key){
        /*for (int index = 0; index < arr.length; index++) {
            if (arr[index]==key){
                return index;
            }
        }
        return -1;*/
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                if (mid == 0 || arr[mid - 1] < key) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;

    }
     int lastOccurence(int [] arr,int key){
        /*for (int index = arr.length-1; index >=0 ; index--) {
            if (arr[index]==key){
                return index;
            }

        }
        return -1;*/
         int low = 0;
         int high = arr.length - 1;
         while (low <= high) {
             int mid = low + (high - low) / 2;
             if (arr[mid] == key) {
                 if (mid == arr.length - 1 || arr[mid + 1] > key) {
                     return mid;
                 } else {
                     low = mid + 1;
                 }
             } else if (arr[mid] < key) {
                 low = mid + 1;
             } else {
                 high = mid - 1;
             }
         }
         return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 4, 4, 5};
        int key = 3;
        int key2 =6;
        SearchRange sc=new SearchRange();
        int[] result = sc.searchRange(arr, key);

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Number: " + key);
        System.out.println("Answer: [" + result[0] + ", " + result[1] + "]");
        int[] result2 = sc.searchRange(arr, key2);

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Number: " + key2);
        System.out.println("Answer: [" + result2[0] + ", " + result2[1] + "]");
    }

}
