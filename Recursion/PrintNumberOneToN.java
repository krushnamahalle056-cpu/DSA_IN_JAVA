package Recursion;

import java.util.Scanner;

public class PrintNumberOneToN {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        print1toN(1 , n);
    }

    public static void print1toN(int a , int n){
        if (a > n) return;
        System.out.println(a);
        print1toN(a+1 , n);
    }

}
