package questions;

import java.util.Scanner;

public class MaxMarksSemester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sem = sc.nextInt();
        for(int i=1;i<=sem;i++)
        {
            int sub = sc.nextInt();
            int max = 0;
            for(int j=1;j<=sub;j++)
            {
                int mark = sc.nextInt();
                if(mark<0 || mark>100)
                {
                    System.out.println("You have entered invalid mark.");
                    return;
                }

                if(mark > max)
                    max = mark;
            }
            System.out.println("Maximum mark in " + i + " semester: " + max);
        }
    }
}
