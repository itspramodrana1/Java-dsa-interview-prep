package arrays;

public class Equalibrium_Point {

    public static int equlibriumPoint(int[] arr){
        int total = 0;
        for(var nums : arr){
            total += nums;
        }
        int leftSum = 0;
        for(int i=0; i<arr.length;i++){
            int rightSum = total-leftSum-arr[i];
            if(rightSum==leftSum){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int pivot =  equlibriumPoint(nums);
        System.out.println(pivot);  // output 3
    }
}
