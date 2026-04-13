package strings;

import java.util.Scanner;

public class reverse_String {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word : ");
        String str = sc.nextLine();

      String s =reverseWord2(str);
        System.out.println(s);
    }

    private static String reverseWord(String str) {

        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
           sb.append(str.charAt(i));
        }

        return sb.toString();
    }


    public static String reverseWord2(String s){
        StringBuilder sb = new StringBuilder(s);
        int st = 0;
        int end = s.length()-1;
        while(st<end){
            char temp = sb.charAt(st);
            sb.setCharAt(st,sb.charAt(end));
            sb.setCharAt(end,temp);
            st++;
            end--;
        }
       return sb.toString();
    }
}
