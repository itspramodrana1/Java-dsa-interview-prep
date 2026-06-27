package arrays;

import java.util.HashSet;

public class L1346_CheckIfNDoubleExist {

    /*
    1346. Check If N and Its Double Exist

    Given an array arr of integers, check if there exist two indices
    i and j such that :

    i != j
    0 <= i, j < arr.length
    arr[i] == 2 * arr[j]
   Example 1:
   Input: arr = [10,2,5,3]
   Output: true
   Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
   Example 2:

    Input: arr = [3,1,7,11]
    Output: false
    Explanation: There is no i and j that satisfy the conditions.
    Constraints:

    2 <= arr.length <= 500
    -103 <= arr[i] <= 103
     */

    public  static boolean nDoubleExist(int[] arr){
        HashSet<Integer> st = new HashSet<>();
        for(int i=0; i< arr.length; i++){
            if((st.contains( 2 * arr[i])) || (st.contains(arr[i] / 2) && arr[i] % 2 == 0)){
                return true;
            }
            st.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 7, 14, 9};

        boolean ans = nDoubleExist(arr);
        System.out.println(ans);

    }
}
