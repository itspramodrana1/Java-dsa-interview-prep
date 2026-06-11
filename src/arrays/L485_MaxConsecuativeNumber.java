package arrays;

import java.util.Scanner;

public class L485_MaxConsecuativeNumber {

     public static int maxConsecutive(int[] arr){

         int count = 0,
                 max = 0;

         for(int i=0; i<arr.length; i++){

             if(arr[i] == 1){
                 count++;
             }else{
                 max = Math.max(count,max);
                 count = 0;
             }
         }
         return Math.max(count,max);
     }

    public static void main(String[] args) {


        /*
       Example 1:
  Input: nums = [1,1,0,1,1,1]
  Output: 3
  Explanation: The first two digits or the last three digits are consecutive 1s.
  The maximum number of consecutive 1s is 3.

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Arrays : ");
        int n = sc.nextInt();

        System.out.println("Enter the no of Array : ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

      int max =  maxConsecutive(arr);
        System.out.println(max);
    }
}
