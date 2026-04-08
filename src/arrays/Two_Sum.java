package arrays;

import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args) {

        int[] nums = {1, 5, 4, 7, 3, 8};
        int target = 10;
        int[] ans = twoSum(nums,target);

        for(var num : ans){
            System.out.print("The index is : "+num +" ");
        }
    }

    private static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = {-1};
        for(int i=0; i< nums.length;i++){

            int diff = target-nums[i];
            if(map.containsKey(diff)){
                ans = new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}
