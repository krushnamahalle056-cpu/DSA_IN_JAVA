package Recursion;

import java.util.Scanner;

public class PowerLinear {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter base: ");
        int a =  sc.nextInt();
        System.out.print("enter exponent: ");
        int b = sc.nextInt();
        System.out.print(a + " raised to the power " + b + " is : ");
    }


//    // Code for Time complexity = O(b)

//    static int pow(int a, int b){
//        if(b == 0) return 1;
//        return a * pow(a, b-1);
//    }

//    // code for Time complexity = O(log)
//    static int pow(int a,int b){
//        if(b==0) return 1;
//        int call = pow(a,b-1);
//        if(b%2 == 0) return call*call;
//        else return a*call*call;
//    }



}

