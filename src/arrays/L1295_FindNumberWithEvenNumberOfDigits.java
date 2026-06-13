package arrays;

public class L1295_FindNumberWithEvenNumberOfDigits {

    /*
     1295. Find Numbers with Even Number of Digits
     Given an array nums of integers, return how many of them contain an even number
    of digits.

     Example 1:
    Input: nums = [12,345,2,6,7896]
    Output: 2
     */

    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            int digits = String.valueOf(num).length();

            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] arr = {12,345,2,6,7896};

        int ans = findNumbers(arr);
        System.out.println(ans);
    }
}
