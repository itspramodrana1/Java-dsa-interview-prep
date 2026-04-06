package arrays;

public class RearrangementElement {
    public static void rearrangeElement(int[] nums){

        int[] temp = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for(int i=0;i< nums.length;i++){
            if(nums[i]>0){
                temp[pos] = nums[i];
                pos +=2;
            }else {
                temp[neg] = nums[i];
                neg += 2;
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = temp[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        rearrangeElement(arr);
        for(var nums : arr){
            System.out.print(nums+" ");  // output - {3, -2, 1, -5, 2, -4}
        }
    }
}
