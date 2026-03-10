package questions;

import java.util.Scanner;

public class TyresCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        for(int i=1;i<=d;i++)
        {
            int cars = sc.nextInt();
            int bikes = sc.nextInt();
            int tyres = (cars * 4) + (bikes * 2);
            System.out.println(tyres);
        }
    }
}