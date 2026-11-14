package Recursion;

import java.util.Scanner;

public class PrintNToN {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
    }

    static void printNtoN(int n){
        if(n==0) return ;
        System.out.print(n+ " ");
        printNtoN(n-1);
        if(n!=1) {
            System.out.print(n + " ");
        }
    }


}
