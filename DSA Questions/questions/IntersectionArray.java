package questions;

import java.util.*;

public class IntersectionArray {

    public static void main(String[] args){
        int nums1[]={1,2,2,1};
        int nums2[]={2,2};
        Set<Integer> set1=new HashSet<>();
        Set<Integer> result=new HashSet<>();
        for(int i:nums1)
            set1.add(i);
        for(int j:nums2){

            if(set1.contains(j))
                result.add(j);
        }
        System.out.println(result);
    }
}
