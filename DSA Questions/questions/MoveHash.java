package questions;

public class MoveHash {

    public static void main(String[] args){
        String str="Move#Hash#to#Front";
        int count=0;
        String result="";
        for(char c:str.toCharArray()){
            if(c=='#')
                count++;
            else
                result+=c;
        }
        for(int i=0;i<count;i++)
            result="#"+result;

        System.out.println(result);
    }
}