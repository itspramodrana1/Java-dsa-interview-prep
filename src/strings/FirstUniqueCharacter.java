package strings;

public class FirstUniqueCharacter {



    private static String firstNonRepeatingiCharacterPrint(String s) {
         String chh = "";
        int[] count = new int[26];
        for (var ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (count[ch - 'a'] == 1) {
              chh += ch;
              break;
            }
        }
        return chh;
    }



    public static void main(String[] args) {
        String s = "ppramod";
        String str = firstNonRepeatingiCharacterPrint(s);
        System.out.println(str.charAt(0));


     //   int idx = uniqueFirstCharacter(s);
     //   System.out.println(idx);
    }


                     // LeetCode   387
          //  Input: s = "loveleetcode"
          //Output: 2

    private static int uniqueFirstCharacter(String s) {

        int[] count = new int[26];
        for (var ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (count[ch - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
