package questions;

public class LongestPalindrome {

    public static void main(String[] args){
        String s="babad";
        String longest="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub=s.substring(i,j);
                if(isPalindrome(sub) && sub.length()>longest.length())
                    longest=sub;
            }
        }
        System.out.println(longest);
    }
    static boolean isPalindrome(String s){

        String rev=new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }
}