package arrays;

public class SecondLargestElement {
    public static int secondLargest(int[] arr) {

        int n = arr.length;
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {

        // Input -> arr = {3, 6, 4, 8, 2, 1}
        // Output -> 6

        int[] arr = {3, 6, 4, 8, 2, 1, 9};

        int secondLargest = secondLargest(arr);
        System.out.println("Second Largest " + secondLargest);
    }
}
