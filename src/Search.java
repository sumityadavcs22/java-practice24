public class Search {
    boolean containsElement (int[] arr, int key) {
        int first = 0;
        int last = arr.length - 1;

        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (arr[mid] == key) {
                return true;
            } else if (arr[mid] < key) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return false;
    }

}
