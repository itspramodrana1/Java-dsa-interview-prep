package arrays;

public class WaveArray {
    public static void main(String[] args) {


        // Same Concept As Wiggle Array Leetcode 280 (Premeium Question)

        int[] nums = {10, 90, 49, 2, 1, 5, 23};
        //  output nums = {90, 10, 49, 1, 5, 2, 23}

        waveArray(nums);

        for(var num : nums){
            System.out.print(num+" ");
        }
    }

    private static void waveArray(int[] nums) {

        for(int i=0;i<nums.length-1;i++){
            if(i % 2 == 0){
                if(nums[i]< nums[i+1]){
                    swap(nums,i,i+1);
                }
            }else{
                if(nums[i]>nums[i+1]){
                    swap(nums,i,i+1);
                }
            }
        }

    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
