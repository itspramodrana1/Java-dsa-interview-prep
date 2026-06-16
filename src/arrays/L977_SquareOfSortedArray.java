package arrays;

public class L977_SquareOfSortedArray {

    /*
    Given an integer array nums sorted in non-decreasing order,
    return an array of the squares of each number sorted in non-decreasing order.
    Example 1:
    Input: nums = [-4,-1,0,3,10]
    Output: [0,1,9,16,100]
    Explanation: After squaring, the array becomes [16,1,0,9,100].
    After sorting, it becomes [0,1,9,16,100].

     */
    public static int[] squareSorted(int[] arr){
        int n = arr.length;

        int i = 0;
        int j = n-1;
        int [] ans = new int[n];
        for(int p=n-1; p>=0; p--){
            if(Math.abs(arr[i])>Math.abs(arr[j])){
                ans[p] = arr[i] * arr[i];
                i++;
            }else{
                ans[p] = arr[j] * arr[j];
                j--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {-4, -1, 0, 3, 10};

        int[] ans = squareSorted(arr);

        for(var res : ans){
            System.out.print(res+" ");
        }

    }
}
