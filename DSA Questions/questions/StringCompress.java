package questions;

public class StringCompress {

    public static void main(String[] args){
        String s="aabbbbeeeeffggg";
        int count=1;
        for(int i=0;i<s.length();i++){
            if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1))
                count++;
            else{
                System.out.print(s.charAt(i)+""+count);
                count=1;
            }
        }
    }
}