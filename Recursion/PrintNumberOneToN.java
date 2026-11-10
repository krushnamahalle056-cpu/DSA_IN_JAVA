package Recursion;

import java.util.Scanner;

public class PrintNumberOneToN {
    static int n;
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        print1toN(1);
    }

    // By using two Parameter
//    public static void print1toN(int a , int n){
//        if (a > n) return;
//        System.out.println(a);
//        print1toN(a+1 , n);
//    }


    // By using global variable
        public static void print1toN(int a){
        if (a > n) return;
        System.out.print(a + " ");
        print1toN(a+1);
    }

}
