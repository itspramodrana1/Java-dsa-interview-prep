package arrays;

public class L11_ContainerWithMostWater {

    public static int maxArea(int[] arr){

        int i = 0;
        int j = arr.length - 1;
        int max = Integer.MIN_VALUE;

        while(i < j){
            int wt = j - i;
            int ht = Math.min(arr[i],arr[j]);
            int area = wt * ht;
            max = Math.max(max,area);

            if(arr[i]<arr[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }

    public static void main(String[] args) {


        int[] arr = {1,8,6,2,5,4,8,3,7};

        int maxArea = maxArea(arr);

        System.out.println("Maximum Area is : "+ maxArea);

    }
}
