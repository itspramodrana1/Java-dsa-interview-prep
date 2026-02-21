package sorting;

// Problem: Move Zero
// Platform: LeetCode
// Difficulty: Easy
// Approach: Bubble Sort
// Time Complexity: O(n^2)
// Space Complexity: O(1)


public class MoveZero {

    // Question 1 :- Given an integer array arr, move all 0's to the end of it while
    //               maintaining the relatives order of the non-zero elements.
    //  NOTE :- Note that you must do this in-place without making a copy of the array.
    // input :-  0 5 0 3 42
    //  output :- 5 3 42 0 0
    public static void zeroSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }
    public static void main(String[] args) {

        int[] arr = {4, 0, 3 , 0, 8, 5, 0, 42};
        zeroSort(arr);
        for(var i : arr){
            System.out.print(i+" ");
        }
    }
}
