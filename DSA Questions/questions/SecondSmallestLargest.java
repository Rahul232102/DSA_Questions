package questions;

import java.util.*;

public class SecondSmallestLargest {
    public static void main(String[] args){
        int arr[]={1,2,4,7,7,5};
        Arrays.sort(arr);
        int secondSmall=-1, secondLarge=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[0]){
                secondSmall=arr[i];
                break;
            }
        }
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!=arr[arr.length-1]){
                secondLarge=arr[i];
                break;
            }
        }
        System.out.println("Second Smallest: "+secondSmall);
        System.out.println("Second Largest: "+secondLarge);
    }
}
