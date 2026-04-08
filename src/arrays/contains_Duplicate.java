package arrays;

import java.util.HashSet;

public class contains_Duplicate {
    public static void main(String[] args) {
        /*
        Given an integer array nums, return true if any value appears at
        least twice in the array, and return false if every element is distinct.
Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.
Example 2:
Input: nums = [1,2,3,4]
Output: false
Explanation:
All elements are distinct.
Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
Constraints:
1 <= nums.length <= 105
-109 <= nums[i] <= 109
         */

        //   int[] arr = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        //  int [] arr = {1, 2, 3, 4, 5, 8};
        // System.out.println(containsDuplicate(arr));



        // Question 2  Count Distinct Element
        int[] nums = {1, 2, 3, 4, 6, 7, 3, 4};
        // output arr = {1, 2, 3, 4, 6, 7}
        int count = countDistinct(nums);
        System.out.println(count);
    }

    private static int countDistinct(int[] arr) {
        HashSet<Integer> st = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!st.contains(arr[i])){
                st.add(arr[i]);
            }
        }
        return st.size();
    }



    private static boolean containsDuplicate(int[] arr) {
        HashSet<Integer> st = new HashSet<>();
        for(int i=0; i<arr.length;i++){
            if(st.contains(arr[i])){
                return true;
            }
            st.add(arr[i]);

        }
        return false;
    }
}
