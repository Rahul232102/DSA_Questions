package questions;

public class MaxProductSubarray {

    public static void main(String[] args){
        int nums[]={2,3,-2,4};
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            int product=1;
            for(int j=i;j<nums.length;j++){
                product*=nums[j];
                max=Math.max(max,product);
            }
        }
        System.out.println(max);
    }
}