package arrays;

import java.util.HashSet;

public class intersection_Element {
    public static void main(String[] args) {

        /*
        Given two integer arrays nums1 and nums2, return an array of their intersection.
         Each element in the result must be unique and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
Constraints:
1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
         */

        int[] arr = {1, 2, 2, 1};
        int[] brr = {2, 2};

        int[] ans = interseElement(arr,brr);
        for(var num : ans){
            System.out.print(num+" ");
        }
    }

    private static int[] interseElement(int[] nums1, int[] nums2) {
        HashSet<Integer> st = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for(var num : nums1){
            st.add(num);
        }
        for(var num : nums2){
            if(st.contains(num)){
                result.add(num);
            }
        }
        int[] ans = new int[result.size()];
        int i = 0;
        for(var num : result){
         ans[i++] = num;
        }

        return ans;
    }
}
