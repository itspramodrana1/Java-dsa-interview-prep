package sorting;

public class compressdString {
    public static void main(String[] args) {

        String s = "abbeeyyystt";

        String str = compressString(s);
        System.out.println(str);
    }

    private static String compressString(String s) {
        String ans = "";
        int count = 1;
        for(int i=1; i<s.length();i++){
            char ch  = s.charAt(i);
            if(ch == s.charAt(i-1)){
                count++;
            }else{
                ans += ch;
                if(count>1){
                    ans += count;
                }
                count = 1;
            }
            if(count>1){
                ans += count;
            }

        }


        return ans;
    }
}
