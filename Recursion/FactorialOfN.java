package Recursion;

import java.util.Scanner;

public class FactorialOfN {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        factorial(n);

    }
    public static int factorial(int n){
        if(n==0 || n==1) return 1;
        int ans =  n * factorial(n-1);
        return ans;
    }

}
