package recursion;

import java.util.ArrayList;
import java.util.Scanner;

//import static jdk.internal.org.jline.reader.impl.LineReaderImpl.CompletionType.List;

public class L46_Subsets {

    /*
    78. Subsets
    Given an integer array nums of unique elements, return all possible
    subsets (the power set).

    The solution set must not contain duplicate subsets. Return the
    solution in any order.
    Example 1:
    Input: nums = [1,2,3]
    Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
    Example 2:
   Input: nums = [0]
   Output: [[],[0]]
     */

    public static void subsets(int[] nums, ArrayList<ArrayList<Integer>> arr,
                               ArrayList<Integer> ds, int idx){

        if(idx== nums.length){
            arr.add(new ArrayList<>(ds));
            return;
        }

        ds.add(nums[idx]);
        subsets(nums,arr,ds,idx+1);
        ds.remove(ds.size()-1);
        subsets(nums,arr,ds,idx+1);
    }

    public static void main(String[] args) {

        System.out.println("Enter the size of Array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the no of Arrays : ");
        int[] nums = new int[n];
        for(int i =0; i<n;i++){
            nums[i] = sc.nextInt();
        }
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();

        subsets(nums,arr,ds,0);

//        for(var num : arr){
//            System.out.print(num);
//        }
        System.out.println(arr);
        for(int i=0; i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
