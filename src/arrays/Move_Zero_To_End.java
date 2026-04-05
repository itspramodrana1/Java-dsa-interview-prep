package arrays;

public class Move_Zero_To_End {
    public static void moveZero(int[] arr){
        int j = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] !=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {3, 0, 6, 7, 0, 2, 7, 0};  // input
     // output {3, 6, 7, 2, 7, 0, 0, 0}
        moveZero(arr);

        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
