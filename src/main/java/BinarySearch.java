public class BinarySearch {
    public static int search(int num, int[] arr) {

        int leftIndex = 0;
        int rightIndex = arr.length-1;

        while (leftIndex <= rightIndex) {
            int midpoint = (leftIndex + rightIndex)/2;
            if (num == arr[midpoint]) {
                return midpoint;
            } else if (num > arr[midpoint]) {
                leftIndex = midpoint + 1;
            } else {
                rightIndex = midpoint - 1;
            }
        }

        return -1;
    }
}
