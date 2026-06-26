package strings;

public class PalindromeOrNot {
    public static void main(String[] args) {
//        String s = "level";
//        StringBuilder s1 = new StringBuilder(s);
//        s1.reverse();
//        String s3 = s1 +"";
//        if(s.equals(s3)){
//            System.out.println("String is Palindrome");
//        }else{
//            System.out.println("String is Not is Palindrome");
//        }


        String str = "levelr";
        int i = 0;
        int j = str.length()-1;
        boolean flag = true;
        while (i<j){
            if(str.charAt(i)!=str.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if(flag==true){
            System.out.println("String is Palindrome");
        }
        else System.out.println("String is NOT Palindrome");
    }
}
