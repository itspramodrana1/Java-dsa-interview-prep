package strings;

import java.util.*;

public class reverse_Word {
    public static String reverse(String s){
    String[] str = s.split("\\s+");

    StringBuilder result = new StringBuilder();

       for(int i=str.length-1;i>=0;i--){
        result.append(str[i]);
        if(i>0){
            result.append(" ");
        }
    }
       return result.toString();
}
public static void main(String[] args) {

    // Input --> Java is Easy
    // output --> Easy is Java
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Sentence ");
    String s = sc.nextLine();

    String str = reverse(s);
    System.out.println(str);
}
}
