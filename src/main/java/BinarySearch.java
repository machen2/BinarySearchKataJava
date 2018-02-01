public class BinarySearch {
    public static int search(int num, int[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int leftIndex = 0;
        int rightIndex = arr.length-1;
        int midpoint = (leftIndex + rightIndex)/2;

        if (num == arr[midpoint]) {
            return midpoint;
        }

        return -1;
    }
}
