package arrays;

import java.util.HashSet;

public class L349_Intersection_Of_Two_Arrays {
    public static void main(String[] args) {

        int[]  nums1 = {3, 4, 6, 1, 9};
        int[]  nums2 = {5, 3, 8, 9, 2};

        int[] arr = intersectionTwoArrays(nums1,nums2);
        for(var num : arr){
            System.out.print(num+" ");
        }
    }

    private static int[] intersectionTwoArrays(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for(var num : nums1){
            set.add(num);
        }

        for(var num : nums2){
            if(set.contains(num)){
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
