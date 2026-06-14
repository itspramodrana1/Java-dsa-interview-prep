package strings;

import java.util.Scanner;

public class L1446_ConsecutiveCharacter {

    public static int countConsecutive(String s){

        if(s.length()==0 || s==null){
            return 0;
        }

        int currentStreak = 1;
        int maxStreak = 1;

        for(int i=1; i<s.length(); i++){

            if(s.charAt(i)==s.charAt(i-1)){
                currentStreak++;
            }else{
                currentStreak = 1;
            }
            maxStreak = Math.max(currentStreak,maxStreak);
        }
        return maxStreak;
    }

    public static void main(String[] args) {
        /*

       The power of the string is the maximum length of a non-empty substring that
       contains only one unique character.

       Given a string s, return the power of s.
       Example 1:
       Input: s = "leetcode"
       Output: 2
       Explanation: The substring "ee" is of length 2 with the character 'e' only.
         */

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int ans = countConsecutive(str);
        System.out.println(ans);
    }
}
