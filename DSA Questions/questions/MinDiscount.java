package questions;

import java.util.*;

public class MinDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String minItem = "";
        int minDiscount = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            String line = sc.nextLine();
            String arr[] = line.split(",");
            String name = arr[0];
            int price = Integer.parseInt(arr[1]);
            int dis = Integer.parseInt(arr[2]);
            int discount = price * dis / 100;

            if(discount < minDiscount)
            {
                minDiscount = discount;
                minItem = name;
            }
        }
        System.out.println(minItem);
    }
}
