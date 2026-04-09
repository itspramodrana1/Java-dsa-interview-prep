package strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String s1 = "pramod";
        String s2 = "domarP";
        System.out.println(anagram(s1,s2));
    }

    private static boolean anagram(String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i=0;i<s1.length();i++){
            if(c1[i] != c2[i]){
                return false;
            }
        }

        return  true;
    }
}
