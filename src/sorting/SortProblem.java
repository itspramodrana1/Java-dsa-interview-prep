package sorting;

// Problem: Sort an Almost Sorted Array (Two Swapped Elements)
// Platform: Common Interview Problem (Asked in product-based companies, practice on LeetCode/GFG)
// Difficulty: Medium
// Approach:
// The array is sorted except two swapped elements.
// Traverse once and find the first and second violations (inversions).
// Store their indices and swap them at the end.
// This fixes the array in a single pass.
// Time Complexity: O(n)
// Space Complexity: O(1)

public class SortProblem {

    public static void displayArrr(int[] num){
            for(var i : num){
                System.out.print(i+" ");
            }
        }

//   Question 1:- GIVEN AN ARRAY WHERE ALL ITS ELEMENTS ARE SORTED IN INCREASING ORDER EXCEPT
//  TWO SWAPPED ELEMENTS, SORT IT IN LINEAR TIME.ASSUME THERE ARE NO DUPLICATES IN THE ARRAY.
             // Input A[] = [3, 8, 6, 7, 5, 9, 10]
            // Output A[] = [3, 5, 6, 7, 8, 9, 10]
        public static void sortArray(int[] num){
            int n = num.length;
            int x = -1, y = -1;
            if(n <= 1){   // corner case
                return;
            }
            // process all adjacent element
            for(int i=1; i<n; i++){
                if(num[i-1]>num[i]){   // first conflict
                    if(x==-1){
                        x = i-1;
                        y = i;
                    }else{           // second conflict
                        y = i;
                    }
                }
            }
            int temp = num[x];
            num[x] = num[y];
            num[y] = temp;
        }
        public static void main(String[] args) {
            int[] num = {3, 8, 6, 7, 5, 9, 10};
            sortArray(num);
            displayArrr(num);

        }
}
