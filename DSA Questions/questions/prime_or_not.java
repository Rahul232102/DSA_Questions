package questions;

import java.util.Scanner;

public class prime_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean isPrime = true;
        if(n <= 1)
            isPrime = false;
        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println("True");
        else
            System.out.println("False");
    }
}