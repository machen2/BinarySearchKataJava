public class BinarySearch {
    public static int search(int num, int[] arr) {

        int leftIndex = 0;
        int rightIndex = arr.length-1;
        int midpoint = (leftIndex + rightIndex)/2;

        while (leftIndex <= rightIndex) {
            if (num == arr[midpoint]) {
                return midpoint;
            } else if (num > arr[midpoint]) {
                leftIndex = midpoint + 1;
                midpoint = (leftIndex + rightIndex)/2;
            }
        }

        return -1;
    }
}
