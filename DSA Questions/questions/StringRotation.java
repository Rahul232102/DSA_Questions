package questions;

public class StringRotation {
    public static void main(String[] args){
        String s="abcde";
        String goal="cdeab";
        if((s+s).contains(goal))
            System.out.println(true);
        else
            System.out.println(false);
    }
}
